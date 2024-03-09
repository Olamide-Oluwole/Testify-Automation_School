def length_converter(length, from_unit, to_unit):

    # Convert length to base unit (meter)
    length_in_meter = length / from_unit

    # Convert length from meter to foot
    converted_length = length_in_meter * to_unit

    return converted_length


# Example usage:
length = 10  # Length to convert
from_unit = 10  # Unit to convert from (meter)
to_unit = 100  # Unit to convert to (foot)

converted_length = length_converter(length, from_unit, to_unit)
print(f"{length} meters is equal to {converted_length} foot.")
