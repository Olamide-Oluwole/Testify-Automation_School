from abc import ABC, abstractmethod

class Vehicle(ABC):
    @abstractmethod
    def drive_direction(self):
        pass

class Car(Vehicle):
    def drive_direction(self):
        return "Car drives forward"

class Plane(Vehicle):
    def drive_direction(self):
        return "Plane flies"

# Instantiating Car and Plane objects
car = Car()
plane = Plane()

# Invoking drive_direction() method for each object
print(car.drive_direction())
print(plane.drive_direction())
