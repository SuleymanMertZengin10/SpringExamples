package modelconstructorInjectionAnnotation;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//bunlardan bir olmalýkibunlra eriþebilelim
//@Service
//@Component
//@Controller
@Repository("collectionInjectionAnnotation")
public class CollectionInjectionAnnotation {
	
    @Resource(name="utilAnnotatioList1")
    //collectio  typelarý inject ederken @Autowired yerine @Resource yada @Value annotationlarý kullanýlýr
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
