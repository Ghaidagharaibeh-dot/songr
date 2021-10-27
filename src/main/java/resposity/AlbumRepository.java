package resposity;

import com.example.songr.modal.Album;
import org.springframework.data.repository.CrudRepository;
@Repositiry
public interface AlbumRepository extends CrudRepository<Album,Integer> {

}
