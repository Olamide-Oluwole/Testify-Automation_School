import unittest

class TestStringComparison(unittest.TestCase):
    def test_equal_strings(self):
        string1 = "Welcome"
        string2 = "hello"
        self.assertEqual(string1, string2)

    def test_different_strings(self):
        string1 = "Welcome"
        string2 = "world"
        self.assertNotEqual(string1, string2)

class TestNumberComparison(unittest.TestCase):
    def test_equal_numbers(self):
        num1 = 10
        num2 = 10
        self.assertEqual(num1, num2)

    def test_different_numbers(self):
        num1 = 5
        num2 = 10
        self.assertNotEqual(num1, num2)

if __name__ == '__main__':
    unittest.main()
