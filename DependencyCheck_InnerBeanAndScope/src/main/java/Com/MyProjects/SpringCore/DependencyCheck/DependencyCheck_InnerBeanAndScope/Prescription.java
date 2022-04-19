package Com.MyProjects.SpringCore.DependencyCheck.DependencyCheck_InnerBeanAndScope;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {

	private int id;
	private String patientName;
	List<String> medicines;

	public int getId() {
		return id;
	}

	@Required // it makes this Id mandatory (an annotation from spring) -> apply only to
				// setter methods
	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	@Required // it makes this PatientName mandatory
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public List<String> getMedicines() {
		return medicines;
	}

	@Required // it makes this Medicines mandatory
	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}

	@Override
	public String toString() {
		return "Prescription [ id = " + id + ", patientName = " + patientName + ", medicines = " + medicines + "]";
	}

}
