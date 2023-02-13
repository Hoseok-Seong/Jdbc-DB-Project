package myapp.service;

import java.sql.Connection;

import myapp.model.ProductRepository;

public class ProductService {

    private ProductRepository productRepository;

    private Connection conn; // 트랜젝션 관리하기 위함.

    public ProductService(ProductRepository productRepository, Connection conn) {
        this.productRepository = productRepository;
        this.conn = conn;
    }

    public void 상품등록(String name, int price, int qty) {
        // 트랜젝션 시작
        try {
            productRepository.insert(name, price, qty);
            productRepository.insert(name, price, qty);
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        // 트랜젝션 종료
    }

    public void 상품삭제(int id) {
        // 트랜젝션 시작
        try {
            productRepository.deleteById(id);
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        // 트랜젝션 종료
    }

    public void 상품수정(String name, int price, int qty, int id) {
        // 트랜젝션 시작
        try {
            productRepository.updateById(name, price, qty, id);
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        // 트랜젝션 종료
    }
}
