public interface Task17B {
    // Interface for testing login functionality
    /**
         * Test the scenario where the correct username is entered.
         * @param username The correct username to be tested.
     */
        void testCorrectUsername(String username);

        /**
         * Test the scenario where the correct password that matches the username is entered.
         *
         * @param username The correct username.
         * @param password The correct password corresponding to the username.
         */
        void testCorrectPassword(String username, String password);

        /**
         * Test the scenario where login to the homePage or dashboard is successful.
         *
         * @param username The correct username.
         * @param password The correct password corresponding to the username.
         */
        void testSuccessfulLogin(String username, String password);
    }


