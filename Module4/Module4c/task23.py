class User:
    def __init__(self):
        self.__password = "password"

    def get_password(self):
        return self.__password

class ActiveUser(User):
    def get_password(self):
        return "********"

# Instantiate an object of the ActiveUser class
active_user_instance = ActiveUser()

# Print the value of get_password() from the object instance
print(active_user_instance.get_password())  # Output: ********
