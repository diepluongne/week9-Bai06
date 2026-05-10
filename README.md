# Bài 6 — Tối ưu CI với cache Maven

## Cấu hình

- `actions/setup-java@v4` với **`cache: maven`** để GitHub Actions tái sử dụng thư mục repository Maven (~/.m2) giữa các lần chạy.

## So sánh thời gian (thực hiện trên repo của bạn)

| Lần chạy | Ghi chú | Thời gian workflow (ước lượng) |
|----------|---------|--------------------------------|
| 1 (chưa cache / cache miss) | Push sau khi bật `cache: maven` | *điền từ tab Actions* |
| 2 (cache hit) | Push liền sau, cùng `pom` | *điền* — thường nhanh hơn ở bước resolve dependency |

Trong log lần 2, tìm dòng kiểu **“Cache hit”** / **“Restored”** cho Maven (tùy phiên bản action) thay vì tải lại toàn bộ từ Central.

## Chạy local

```bash
chmod +x run.sh
./run.sh
```
