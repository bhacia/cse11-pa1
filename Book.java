class Book {
    /*
      @param length The number of characters to appear before "..."
      @return A new string containing length characters followed by "..." if the
      string was too long, or the original string otherwise
    */
    String title;
    String author;
    int percent;
    Book(String title, String author, int percent){
        this.title = title;
        this.author = author;
        this.percent = percent;
    }

    String truncateTitle(int length) {
        for(i = 0; i <= this.title.length(); i++;){
            if(i < this.length) {
                System.out.println(this.title.charAt(i));
            }
            System.out.println(this.charAt(i));
        }
    }
  
    Book schemer = new Book("The Little Schemer", "Daniel P. Friedman", 40);
    Book stick = new Book("Make It Stick: The Science of Successful Learning", "Peter C. Brown", 13);
  
    String truncate1 = this.stick.truncateTitle(15);
    String truncate2 = this.schemer.truncateTitle(20);
    String truncate3 = this.schemer.truncateTitle(0);
  }