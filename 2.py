from zeep import Client
from zeep.exceptions import Fault

# Define the WSDL URL
wsdl_url = 'http://localhost:8080/different_platform/diff?wsdl'

# Create a client using the WSDL
client = Client(wsdl_url)

# Get the currency amount from the user
try:
    d = float(input("Enter the Currency in Indian Rupees: "))

    # Call the appropriate service operation
    result = client.service.introDollar(d)  # Ensure the operation name is correct
    print(f"Converted Amount in Dollars: {result}")

except AttributeError as e:
    print(f"Error: The service has no operation 'InrtoDollar'. Did you mean 'introDollar'?")
except Fault as fault:
    print(f"Service fault: {fault}")
except ValueError:
    print("Please enter a valid number for the currency amount.")
except Exception as e:
    print(f"An unexpected error occurred: {e}")
