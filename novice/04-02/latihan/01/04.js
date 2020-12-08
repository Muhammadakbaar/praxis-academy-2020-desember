device = IO.open()
reactor = IO.Reactor()

def inputHandler(data):
	"Input data handler"
	print(data)
	reactor.stop()

reactor.addHandler(inputHandler, device, IO.INPUT)
reactor.run() // run reactor, which handles events and calls appropriate handlers
