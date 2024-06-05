+-----------------------+
|      <<interface>>    |
|      OrderHandler     |
+-----------------------+
| +setNextHandler(OrderHandler): void |
| +handle(Order): void throws OrderProcessingException |
+-----------------------+
             ^
             |
  +----------+----------+
  |          |          |
+-------------+   +-------------+   +-------------+   +-------------+
| ValidationHandler |   | PaymentHandler   |   | PackagingHandler |   | ShippingHandler   |
+-------------------+   +------------------+   +------------------+   +------------------+
| -nextHandler: OrderHandler               |
| +setNextHandler(OrderHandler): void      |
| +handle(Order): void throws OrderProcessingException |
+-------------------+   +------------------+   +------------------+   +------------------+
                                 ^
                                 |
+--------------------------------+--------------------------------+
|                                 Order                           |
+--------------------------------------------------------------+
| -valid: boolean                                              |
| -paymentProcessed: boolean                                   |
| -packaged: boolean                                           |
| -shipped: boolean                                            |
+--------------------------------------------------------------+
| +isValid(): boolean                                          |
| +setValid(boolean): void                                     |
| +isPaymentProcessed(): boolean                               |
| +setPaymentProcessed(boolean): void                          |
| +isPackaged(): boolean                                       |
| +setPackaged(boolean): void                                  |
| +isShipped(): boolean                                        |
| +setShipped(boolean): void                                   |
+--------------------------------------------------------------+

+---------------------------+
|    OrderProcessingException |
+---------------------------+
| +OrderProcessingException(message: String) |
+---------------------------+

+---------------------------+
|          Main             |
+---------------------------+
| +main(String[]): void     |
+---------------------------+
