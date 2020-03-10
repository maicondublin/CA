package ie.cct.objectorientedconstructs.s2017053s2018466;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.FeedItem;


public class Feed implements FeedInterface {
	
	   ArrayList<FeedItem> titles = new ArrayList<FeedItem>();
	   
	      private String title;
	      private String FeedItem;
	      
	      
	      public Feed(String title, String FeedItem)  { 
	    	  
	    	  
	       this.title = title;
		   this.FeedItem = FeedItem;
	        
	      }  
	      
public void addCollection(String t, String fi){
	      
	         
	         titles = new ArrayList<FeedItem>( );
	    
	        titles.addAll(titles);
	    
	      }
	          

	
	@Override
	public Collection<String> listTitles() {
		// TODO Auto-generated method stub
		return this.listTitles();
	}

	@Override
	public FeedItem getItem(String title) {
		// TODO Auto-generated method stub
		this.title = title;
		return null;
	}

	@Override
	public int numItems() {
		// TODO Auto-generated method stub
		return this.numItems();
	}

	@Override
	public Collection<FeedItem> findItems(String keyword) {
		// TODO Auto-generated method stub
		this.FeedItem = FeedItem;
		return titles;
		
	}

public void printTitleList() {
	   
    
    System.out.println("FeedItem  Title: " + title  + FeedItem);

          for (int i = 0; i < titles.size(); i++)
       { 
          System.out.println(titles.get(i));
  }
}
}

          
          
          
          
          
          
          
          
          
