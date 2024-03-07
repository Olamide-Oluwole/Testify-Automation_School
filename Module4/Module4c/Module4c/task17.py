class Human:
    color = "Brown"
    gender = "female"
    height = "short"

    def get_properties(self):
        return self.color + ":" + self.gender + ":" + self.height


# An instance of the human class
Bambi = Human()
print("Bambi height is", Bambi.height)