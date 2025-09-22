// Enumeration

enum PaymentStatus{
    PENDING,
    COMPLETED,
    FAILED,
    REFUNDED,
    UNPAID
}

enum AccountStatus{
    ACTIVE,
    CLOSED,
    CANCELLED,
    BLACKLISTED,
    NONE
}

// Custom Person Data Type
Class Person {
    private String name;
    private String address;
    private String phone;
    private String email;
}

Class Address{
   private int zipCode;
   private String address;
   private String city;
   private String state;
   private String country;
}