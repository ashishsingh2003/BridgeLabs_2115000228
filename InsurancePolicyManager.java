import java.util.*;

class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Policy policy = (Policy) obj;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "Policy Number='" + policyNumber + '\'' +
                ", Holder='" + policyholderName + '\'' +
                ", Expiry=" + expiryDate +
                ", Coverage='" + coverageType + '\'' +
                ", Premium=" + premiumAmount +
                '}';
    }
}

public class InsurancePolicyManager {
    private Set<Policy> hashSetPolicies = new HashSet<>();
    private Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<Policy> treeSetPolicies = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public Set<Policy> getAllPolicies() {
        return new HashSet<>(hashSetPolicies);
    }

    public Set<Policy> getExpiringSoon() {
        Set<Policy> expiringSoon = new TreeSet<>();
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date thresholdDate = cal.getTime();

        for (Policy policy : treeSetPolicies) {
            if (!policy.getExpiryDate().after(thresholdDate)) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    public Set<Policy> getPoliciesByCoverageType(String coverageType) {
        Set<Policy> result = new HashSet<>();
        for (Policy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                result.add(policy);
            }
        }
        return result;
    }

    public Set<Policy> getDuplicatePolicies() {
        Set<String> seen = new HashSet<>();
        Set<Policy> duplicates = new HashSet<>();
        for (Policy policy : hashSetPolicies) {
            if (!seen.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        Calendar cal = Calendar.getInstance();
        cal.set(2025, Calendar.MARCH, 15);
        Policy policy1 = new Policy("P001", "Alice", cal.getTime(), "Health", 500.0);

        cal.set(2024, Calendar.FEBRUARY, 20);
        Policy policy2 = new Policy("P002", "Bob", cal.getTime(), "Auto", 300.0);

        cal.set(2024, Calendar.MARCH, 10);
        Policy policy3 = new Policy("P003", "Charlie", cal.getTime(), "Home", 700.0);

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);

        System.out.println("All Policies: " + manager.getAllPolicies());
        System.out.println("Expiring Soon: " + manager.getExpiringSoon());
        System.out.println("Auto Coverage Policies: " + manager.getPoliciesByCoverageType("Auto"));
        System.out.println("Duplicate Policies: " + manager.getDuplicatePolicies());
    }
}

