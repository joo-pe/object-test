package cleancode;

/**
 * 원시값 포장하기
 */
public class Test4 {
    public class Customer {
        private final Long id;
        private final String email;
        private final String name;
        private final String password;

        public Customer(final Long id, final String email, final String name, final String password) {
            this.id = id;
            this.email = email;
            this.name = name;
            this.password = password;
        }
    }
}
