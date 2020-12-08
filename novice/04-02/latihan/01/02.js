device = IO.open()
ready = False
while not ready:
	print("There is no data to rad!")
	ready = IO.poll(device, IO.INPUT, 5) # returns control if 5 second have elapsed or there is data to read (INPUT)
data = device.read()
print(data)
