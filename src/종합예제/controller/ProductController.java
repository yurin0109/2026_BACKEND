package 종합예제.controller;

import java.util.ArrayList;

import 종합예제.model.dao.IBaseDao;
import 종합예제.model.dao.ProductDao;
import 종합예제.model.dto.ProductDto;

public class ProductController {
    private ProductController() {}
    private static final ProductController instance = new ProductController();
    public static ProductController getInstance() { return instance; }
    // ProductController 객체를 하나 만들어서 같이 쓰려고 준비하는 코드 (싱글톤)

    private IBaseDao ib = ProductDao.getInstance();
    // ib라는 변수로 ProductDao를 사용하겠다.
    // IBaseDao = 인터페이스(규격) , ProductDao = 구현체
    public boolean save(ProductDto productDto) {
    // “ProductDto 하나를 받아서, 최종적으로 boolean을 돌려주는 save 메소드”
    // boolean : 결과 자료형 , save : 메소드 이름 , ProductDto productDto : 받아오는 상품정보
        // TODO 1: productDto 전달받아 DAO의 save()를 호출하고 결과 반환
        boolean result = ib.save(productDto);
        // productDto를 ib의 save()에게 준다. 그리고 그 결과를 result에 저장한다.
        return result;
    }
    // save() = 상품정보 받음 → DAO의 save에게 줌 → 결과 받음 → 결과 반환

    public ArrayList<ProductDto> findAll() {
    // “상품정보 여러 개를 담은 ArrayList를 돌려주는 메소드”
        // TODO 2: DAO의 findAll() 호출하여 결과를 받고 반환
        ArrayList<Object> objList = ib.findAll();
        // DAO한테 전체 목록 달라고 해서 objList에 받음
        ArrayList<ProductDto> result = new ArrayList<>();
        // ProductDto를 담을 새로운 리스트 하나 만들기
        for(Object obj : objList) {
            result.add((ProductDto)obj);
        // objList에 있는 걸 하나씩 꺼내서 ProductDto로 바꾼 다음 result에 넣어라.
    }

    return result;
    // 완성된 상품 목록을 돌려준다.
    }
}


