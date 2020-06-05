def text = 'Dear "$firstname $lastname",\nSo nice to meet you in <% print city %>.\nSee you in ${month},\n${signed}'

def binding = ['firstname':'Sam', 'lastname':'Pullara', 'city':'San Francisco', 'month':'December', 'signed':'Groovy-Dev']

def engine = new com.viglet.shio.groovy.template.ShMustacheEngine()
def template = engine.createTemplate(text).make(binding)

def result = 'Dear "Sam Pullara",\nSo nice to meet you in San Francisco.\nSee you in December,\nGroovy-Dev'

template.toString()
