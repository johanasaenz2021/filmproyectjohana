package co.edu.iudigital.app.service.iface;
import java.util.List;
import co.edu.iudigital.app.model.entity.Gender;

public interface GenderService {
	// lista todos los generos
	public abstract List<Gender> getAll();
}
