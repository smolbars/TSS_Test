public class CreateInterval {

  private Interval interval;

  public CreateInterval() {
    interval = new Interval();
  }

  compareInterval(int LimitMin1, int LimitMax1, int LimitMin2, int LimitMax2) {
    if (LimitMin1 < LimitMin2) 
    {
	  if (LimitMax1 < LimitMax2)) {
        interval.setLimit1(LimitMin1);
	    interval.setLimit2(LimitMax2);
	  }
	  else if (LimitMax1 >= LimitMax2) {
	    interval.setLimit1(LimitMin2);
	    interval.setLimit2(LimitMax2);
	  }
    } else if (LimitMin2 > LimitMin1) {
		if (LimitMax2 > LimitMax1)) {
        interval.setLimit1(LimitMin2);
	    interval.setLimit2(LimitMax1);
	  }
	  else if (LimitMin2 <= LimitMin1) {
	    interval.setLimit1(LimitMin1);
	    interval.setLimit2(LimitMax1);
	  } 
	}
  }
}