# spring-boot-ltw

### Mô tả
-- Phần Data --
- Tạo file IProductRepository extends từ CrudRepository để kết nối đến Database
- Tạo file Product để lưu mỗi đối tượng product cần sử dụng

-- Phần Controller --
- url "/" để vào hiển thị trang home
- url "/products" để hiện thị danh sách sản phẩm và các lựa chọn
- url "/products/add" để vào trang thêm sản phẩm sẽ có form điền thông tin sản phẩm có action là "save" để chuyển sang controller "save" nếu có lỗi validate trả ngược về trang "products/add" nếu không có lỗi lưu vào CSDL và đẩy về trang "/products" để hiện thị ra sản phẩm
- url "/products/edit"  để vào trang edit với code product được gửi vào theo, tìm product dưới csdl tương ứng với codeProduct để hiện thị thông tin hiện tại của product trên form. Sau đó sửa thông tin trên form có action là "save" tiếp tục save như addProduct
- url "/products/preDelete" để vào trang xác nhận có xoá hay không. Xác nhận trên form có action là "delete" đưa ra lựa chọn và trả về trang "/products"
- url "/products/save" để lưu thông tin add hoặc edit product


 +) Tạo các templates bằng file html để hiển thị giao diện:
  
   home.html : để vào trang home giao diện 
   listProduce.html : để hiện thị tất cả danh sách sản phẩm có trong DB 
   addProduct.html : để thêm các sản phẩm vào DB
   editProduct.html : để sửa các 1 sản phẩm được chọn.
   confirm.html : để hiện thi trang xóa và xác nhận có xóa hay ko  
   
 +) Trong application.properties 
   chỉ đinh url của database: url=jdbc:mysql://localhost/laptrinhweb
   
   chỉ định username của db: username=root
   
   chỉ định password của db: password=dtm0110
   
 +) Trong pom.xml:
    thêm dependencies tương ứng.

-- Luồng chạy --

    Từ HomeController getmapping sang trang home.html
    Trong trang home có View Product . khi ấn sẽ link tới /product trong RenderProductController qua thẻ <a href="...">
    Khi getmapping sẽ gọi trang listproduct.html để hiển thị trang chứa chi tiết các sản phẩm (thêm, sửa, xóa)
    Trong RenderProductController chứa đối tượng trong database: productRepository thông qua interface IProductRepository 
    Class product: là 1 đối tượng chứa các thuộc tính của sản phầm: code, description, price cùng các message validation
    Trong trang ViewProduct :
      nút: Add product: ấn vào sẽ getmapping tới /add, và trả về trang addProduct.html
        trong trang AddProduct: thêm thông tinc ác thuộc tính sản phẩm (nếu nhập ko đúng sẽ hiện validatation)
        ấn Add product sẽ cập nhật qua requestmethod.POST save: lưu sản phẩm vào database
      nút edit: ấn vào sẽ getmapping tới /edit, lấy ra ID của sản phẩm đó và gọi trang editProduct.html để hiện trang sửa sản phẩm
        trong trang editProduct: sủa các thuộc tinhsc ủa sản phẩm (nếu sủa ko đúng sẽ hiện validation)
        ấn Update product: để cập nhật lại sản phẩm đã sủa qua requestmethod.POST save: lưu sản phẩm vào database
      nút delete: ấn vào sẽ getmapping tới /preDelete, trả về trang confirm.html để hiện trang xóa sản phẩm
        nếu NO: ấn NO sẽ gọi getmapping tới /product và tra về trang listProduct.html (ko gọi tới requestmethod.POST save), danh sách sản phẩm ko đổi
        nếu YES: ấn YES sẽ xóa sản phẩm đó qua postmapping delete: db sẽ xác nhận xóa sản phẩm khỏi database
          và trả về trang listProduct.html là trang chứa danh sách sản phẩm (sản phẩm đã được xóa trong danh sách) 
      nút viewProduct: sẽ trả về trang listProduct.html là trang chứa danh sách tất cả sản phẩm trong database.



## Nhóm 13
  - Đoàn Tuấn Mạnh
  - Phan Trung Hưng
  - Đoàn Huy Tuấn

### Đoàn Tuấn Mạnh (B19DCCN414) - làm package web

  - RenderProductController
  
    + Add
    + Edit
    + Delete
    + Save
### Phan Trung Hưng (B19DCCN606) - làm template

  - addProduct
  - confirm
  - editProduct
  - listProduct
### Đoàn Huy Tuấn (B19DCCN330) - làm pakage data

  - IProductRepository
  - Product
  - HomeController
  - home
