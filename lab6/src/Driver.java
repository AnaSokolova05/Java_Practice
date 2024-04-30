
class Driver {
	
	public static void main(String[] args) {
	
	EmailStore store = new EmailStore();
	
	store.addEmail("email@gmail.com");
	store.addEmail("email2@gmail.com");
	store.addEmail("email3@gmail.com");
	store.addEmail("email4@gmail.com");
	
	store.displayEmails();
	
	WordCounter wc = new WordCounter();
	
	wc.addSentence("This sentence has the word has in it twice");
	wc.outputResults();
	
	}
	
}