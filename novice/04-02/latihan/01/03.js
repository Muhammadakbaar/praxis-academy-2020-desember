ios = IO.IOService()
device = IO.open(ios)

def inputHandler(data, err):
	"Input data handler"
	if not err:
		print(data)

device.readSome(inputHandler)
ios.loop() # wait till all operations have been completed and call all appropriate handlers
