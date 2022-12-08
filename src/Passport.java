import java.time.LocalDate;
import java.util.*;

public class Passport {
    private final Map<Long, PassportWithData> pasportMap;

    public Passport() {
        this.pasportMap = new HashMap<>();
    }

    public void addPasport(Long number, String firstname, String lastName, String middleName, LocalDate dateOfBirth) {
        PassportWithData pasport = new PassportWithData(number, firstname, lastName, middleName, dateOfBirth);
        pasportMap.put(pasport.getNumber(), pasport);
    }


     class PassportWithData {
        private Long number;
        private String firstname;
        private String lastName;
        private String middleName;
        private LocalDate dateOfBirth;

        public PassportWithData(Long number, String firstname, String lastName, String middleName, LocalDate dateOfBirth) {
            this.firstname = firstname;
            this.lastName = lastName;
            this.number = number;
            this.middleName = middleName;
            this.dateOfBirth = dateOfBirth;
        }

        public void setLastName(String lastName) {
            if (lastName == null || lastName.isEmpty()) throw new RuntimeException();
            else this.lastName = lastName;
        }

        public void setNumber(Long number) {
            if (number == null || String.valueOf(number).length() != 15) throw new RuntimeException();
            else this.number = number;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            if (dateOfBirth == null) throw new RuntimeException();
            else this.dateOfBirth = dateOfBirth;
        }

        public void setFirstname(String firstname) {
            if (firstname == null || firstname.isEmpty()) throw new RuntimeException();
            else this.firstname = firstname;

        }

        public String getLastName() {
            return lastName;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public Long getNumber() {
            return number;
        }

        public String getFirstname() {
            return firstname;
        }

        public String getMiddleName() {
            return middleName;
        }

        @Override
        public String toString() {
            return " имя " + firstname + lastName + middleName + " дата рождения " + dateOfBirth;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PassportWithData pasport = (PassportWithData) o;
            return Objects.equals(number, pasport.number) && Objects.equals(firstname, pasport.firstname) && Objects.equals(lastName, pasport.lastName) && Objects.equals(middleName, pasport.middleName) && Objects.equals(dateOfBirth, pasport.dateOfBirth);
        }

        @Override
        public int hashCode() {
            return Objects.hash(number, firstname, lastName, middleName, dateOfBirth);
        }
    }
}