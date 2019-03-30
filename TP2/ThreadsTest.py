import httplib2
import requests

from threading import Thread


class Client(Thread):

	def __init__(self):
		Thread.__init__(self)

	def run(self):
		req = requests.get('http://localhost:8081/dataset')		


class Main:

	clients = []

	def initialize(self):
		self.clients = []	
		for x in range(100):
			self.clients.append(Client())

	def start(self):
		self.initialize()
		for client in self.clients:
			client.start() 

		for client in self.clients:
			client.join()	

main = Main()
main.start()