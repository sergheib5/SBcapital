package apiModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Memes {
    /**
     * "id": "181913649",
     *                 "name": "Drake Hotline Bling",
     *                 "url": "https://i.imgflip.com/30b1gx.jpg",
     *                 "width": 1200,
     *                 "height": 1200,
     *                 "box_count": 2
     */

    String name;
    String url;
    int width;
    int height;
    int box_count;
}
