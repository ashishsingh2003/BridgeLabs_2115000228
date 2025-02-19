import java.time.LocalDate;
import java.util.*;

class InsurancePolicy {
    String policyNumber;
    String policyholderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return "[" + policyNumber + ", " + policyholderName + ", " + expiryDate + ", " + coverageType + ", $" + premiumAmount + "]";
    }
}

public class InsurancePolicyManagementSystem {
    private Map<String, InsurancePolicy> policyMap = new HashMap<>();
    private Map<String, InsurancePolicy> orderedPolicyMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<InsurancePolicy>> expiryDateMap = new TreeMap<>();

    public void addPolicy(InsurancePolicy policy) {
        policyMap.put(policy.policyNumber, policy);
        orderedPolicyMap.put(policy.policyNumber, policy);
        expiryDateMap.computeIfAbsent(policy.expiryDate, k -> new ArrayList<>()).add(policy);
    }

    public InsurancePolicy getPolicy(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<InsurancePolicy> getExpiringPolicies() {
        LocalDate today = LocalDate.now();
        LocalDate threshold = today.plusDays(30);
        return expiryDateMap.subMap(today, true, threshold, true)
                            .values().stream().flatMap(List::stream).toList();
    }

    public List<InsurancePolicy> getPoliciesByHolder(String name) {
        List<InsurancePolicy> result = new ArrayList<>();
        for (InsurancePolicy policy : policyMap.values()) {
            if (policy.policyholderName.equalsIgnoreCase(name)) {
                result.add(policy);
            }
        }
        return result;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        expiryDateMap.headMap(today, true).clear();
        policyMap.values().removeIf(policy -> policy.expiryDate.isBefore(today));
        orderedPolicyMap.values().removeIf(policy -> policy.expiryDate.isBefore(today));
    }

    public void displayPolicies(Map<String, InsurancePolicy> map) {
        for (InsurancePolicy policy : map.values()) {
            System.out.println(policy);
        }
    }

    public static void main(String[] args) {
        InsurancePolicyManagementSystem system = new InsurancePolicyManagementSystem();

        system.addPolicy(new InsurancePolicy("P1001", "John Doe", LocalDate.now().plusDays(10), "Health", 500.0));
        system.addPolicy(new InsurancePolicy("P1002", "Alice Smith", LocalDate.now().plusDays(40), "Auto", 700.0));
        system.addPolicy(new InsurancePolicy("P1003", "John Doe", LocalDate.now().plusDays(20), "Home", 600.0));
        system.addPolicy(new InsurancePolicy("P1004", "Bob Brown", LocalDate.now().minusDays(5), "Health", 800.0));

        System.out.println("All Policies:");
        system.displayPolicies(system.policyMap);

        System.out.println("\nPolicies Expiring in 30 Days:");
        System.out.println(system.getExpiringPolicies());

        System.out.println("\nPolicies for John Doe:");
        System.out.println(system.getPoliciesByHolder("John Doe"));

        system.removeExpiredPolicies();
        System.out.println("\nPolicies after Removing Expired:");
        system.displayPolicies(system.policyMap);
    }
}

