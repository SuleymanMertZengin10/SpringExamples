package modelconstructorInjectionAnnotation;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//bunlardan bir olmal�kibunlra eri�ebilelim
//@Service
//@Component
//@Controller
@Repository("collectionInjectionAnnotation")
public class CollectionInjectionAnnotation {
	
    @Resource(name="utilAnnotatioList1")
    //collectio  typelar� inject ederken @Autowired yerine @Resource yada @Value annotationlar� kullan�l�r
	private List<String>nameList;

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	@Override
	public String toString() {
		return "CollectionInjectionAnnotation [nameList=" + nameList + "]";
	}
	

	
}
