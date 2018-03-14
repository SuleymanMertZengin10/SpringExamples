package modelcollection;

import java.util.List;

public class Employee {
	
	public List<String>nameList;
	
	public List<Adress>adresList;//farklý bir beani liste inject etmek nasýl xml de incele

	
	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}
	
	public List<Adress> getAdresList() {
		return adresList;
	}

	public void setAdresList(List<Adress> adresList) {
		this.adresList = adresList;
	}

	@Override
	public String toString() {
		return "Employee [nameList=" + nameList + ", adresList=" + adresList + "]";
	}

	
	
}
