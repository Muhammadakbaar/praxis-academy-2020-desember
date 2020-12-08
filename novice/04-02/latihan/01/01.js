device = IO.open()
data = device.read() #thread will be blocked until there is no data in the device
print(data)
