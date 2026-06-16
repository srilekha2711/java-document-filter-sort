
import java.util.*;
public class Solution
{ 
    public static Document[] docsWithOldPages(Document[] docs){
        
        int n=0;
        for(Document d:docs){
            if( (d.getPages())%2!=0)
                n+=1;
        }
        Document[] newDocs=new Document[n];
        int i=0;
        for(Document d:docs){
            if( (d.getPages())%2!=0)
                {newDocs[i]=d;
                i+=1;}
        }
        return newDocs;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int id;
	    String title;
	    String folderName;
	    int pages;
	    Document[] docs=new Document[4];
		for(int i=0;i<4;i++){
		    id=sc.nextInt();
		    title=sc.next();
		    folderName=sc.next();
		    pages=sc.nextInt();
		    Document d=new Document(id,title,folderName,pages);
		    docs[i]=(d);
		}
		Document[] fi=docsWithOldPages(docs);
		Arrays.sort(fi,new Comparator<Document>(){
		    @Override
		    public int compare(Document d1, Document d2){
		       return Integer.compare(d1.getId(),d2.getId());
		    }
		});
		for(Document docu:fi)
		  {
		      System.out.println(docu.getId()+" "+docu.getTitle()+" "+ docu.getFolderName()+" ");
		  }
		  sc.close();
	}
}
class Document{
    private int id;
    private String title;
    private String folderName;
    private int pages;
    Document(int id, String title,String folderName,int pages){
        this.id=id;
        this.title=title;
        this.folderName=folderName;
        this.pages=pages;
    }
    
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getFolderName(){
        return folderName;
    }
    public int getPages(){
        return pages;
    }
    
    public void setId(int id){
        this.id=id;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setFolderName(String folderName){
        this.folderName=folderName;
    }
    public void setPages(int pages){
        this.pages=pages;
    }
}