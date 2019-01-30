import requests

base_url = 'https://www.google.com/logos/fnbx/animal_sounds/'

animal_names = ['african-grey-parrot','alligator','ape','bat','bee',
'buffalo','camel','cat','rooster','cow','crow','dog','duck','elephant',
'frog','giraffe','horse','leopard','lion','moose','owl',
'penguin','pig','rat','rattlesnake','rhinoceros','sheep','tiger',
'wolf','zebra','antelope','falcon','panda','rabbit','robin']

def download_file(extension):
	for animal_name in animal_names:
		try:
			file = requests.get(base_url+animal_name+extension,allow_redirects=True)
			open(animal_name+extension,'wb').write(file.content)
			print "DOWNLOADED: "+animal_name+extension
		except:
			print "ERROR WHILE DOWNLOADING "+animal_name+extension

download_file('.mp3')
download_file('.png')
