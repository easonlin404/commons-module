package concert;

import org.springframework.stereotype.Component;

@Component("myPerformance")
public class PerformanceImpl2 implements Performance{

	@Override
	public void perform() {
		throw new IllegalArgumentException("throw exxception");
	}

}
