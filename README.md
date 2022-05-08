# spring-boot-ltw


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


### Đoàn Tuấn Mạnh - làm package web
  -- HomeController
  -- RenderProductController
    + Add
    + Edit
    + Delete
    + Save
### Phan Trung Hưng - làm template
  -- addProduct
  -- confirm
  -- editProduct
  -- home
  -- listProduct
### Đoàn Huy Tuấn - làm pakage data
  -- IProductRepository
  -- Product
