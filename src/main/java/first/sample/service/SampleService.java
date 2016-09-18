package first.sample.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SampleService {

	List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception;

	void insertBoard(Map<String, Object> map) throws Exception;

	Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception;

	List<HashMap<String, Object>> searchPosition(HashMap<String, Object> map) throws Exception;

	void updateBoard(Map<String, Object> map) throws Exception;

	void deleteBoard(Map<String, Object> map) throws Exception;

}
