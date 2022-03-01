package BasicProgram;


public class Author implements Comparable<Author>{  
	private int id;  
	private String bookName;  
	private int age;
	public Author(int id, String bookName, int age) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", bookName=" + bookName + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Author o) {
		if(this.getAge() > o.getAge()) {
			return 1;
			}else
				return -1;
	}
	
		
	}
