package Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.Trader.Trader;

public class Assignment13 {

	public static void main(String args[]) {
		
			Trader t1=new Trader("saikumar","Delhi");
	        Trader t2=new Trader("amarnath","Indore");
	        Trader t3=new Trader("meharaj","nalgonda");
	        Trader t4=new Trader("suresh","pune");
	        Trader t5=new Trader("krishna","Delhi");
	        Trader t6=new Trader("pash","Delhi");
	        
	        Transaction tr1=new Transaction(t1,2011,100000);
			Transaction tr2=new Transaction(t2,2002,100000);
			Transaction tr3=new Transaction(t3,2011,300000);
			Transaction tr4=new Transaction(t4,2009,50000);
			Transaction tr5=new Transaction(t5,2009,75000);
			Transaction tr6=new Transaction(t6,2011,30000);
			
			ArrayList<Transaction> list=new ArrayList<Transaction>();
			list.add(tr1);
			list.add(tr2);
			list.add(tr3);
			list.add(tr4);
			list.add(tr5);
			list.add(tr6);
			
			List<Integer> valueList=list.stream().filter(e->e.getTrader().getCity().equals("Delhi")).map(Transaction::getValue).collect(Collectors.toList());
		
			System.out.println("transactionsí values from the traders living in Delhi");
			System.out.println("-----------------------------------------------------------");
			valueList.forEach(System.out::println);
	        

		}

	}

