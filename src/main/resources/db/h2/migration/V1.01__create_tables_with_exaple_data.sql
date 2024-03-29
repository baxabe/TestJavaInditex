-- START of <<BRANDS TABLE>> creation
CREATE TABLE IF NOT EXISTS BRANDS
(
    ID         LONG AUTO_INCREMENT,
    NAME       VARCHAR(255) NOT NULL,
    CREATED_AT TIMESTAMP,
    UPDATED_AT TIMESTAMP,
    DELETED_AT TIMESTAMP,
    PRIMARY KEY (ID)
);

INSERT INTO BRANDS
(ID,
 NAME,
 CREATED_AT,
 UPDATED_AT,
 DELETED_AT)
VALUES (1,
        'ZARA',
        '2020-01-01 00:00:00.000',
        '2020-01-01 00:00:00.000',
        NULL);
-- END of >>BRANDS TABLE<< creation

-- START of <<PRICES_LIST TABLE>> creation
CREATE TABLE IF NOT EXISTS PRICES_LIST
(
    ID         LONG AUTO_INCREMENT,
    NAME       VARCHAR(255) NOT NULL,
    CREATED_AT TIMESTAMP,
    UPDATED_AT TIMESTAMP,
    DELETED_AT TIMESTAMP,
    PRIMARY KEY (ID)
);

INSERT INTO PRICES_LIST
(ID,
 NAME,
 CREATED_AT,
 UPDATED_AT,
 DELETED_AT)
VALUES (1,
        'Rebajas invierno',
        '2020-01-01 00:00:00.000',
        '2020-01-01 00:00:00.000',
        NULL),
       (2,
        'Rebajas primavera',
        '2020-01-01 00:00:00.000',
        '2020-01-01 00:00:00.000',
        NULL),
       (3,
        'Rebajas verano',
        '2020-01-01 00:00:00.000',
        '2020-01-01 00:00:00.000',
        NULL),
       (4,
        'Rebajas otoño',
        '2020-01-01 00:00:00.000',
        '2020-01-01 00:00:00.000',
        NULL);
-- END of >>PRICES_LIST TABLE<< creation

-- START of <<PRODUCTS TABLE>> creation
CREATE TABLE IF NOT EXISTS PRODUCTS
(
    ID         LONG AUTO_INCREMENT,
    NAME       VARCHAR(255) NOT NULL,
    CREATED_AT TIMESTAMP,
    UPDATED_AT TIMESTAMP,
    DELETED_AT TIMESTAMP,
    PRIMARY KEY (ID)
);

INSERT INTO PRODUCTS
(ID,
 NAME,
 CREATED_AT,
 UPDATED_AT,
 DELETED_AT)
VALUES (35455,
        'Camiseta sport unisex',
        '2020-01-01 00:00:00.000',
        '2020-01-01 00:00:00.000',
        NULL);
-- END of >>PRODUCTS TABLE<< creation

-- START of <<PRICES TABLE>> creation
CREATE TABLE IF NOT EXISTS PRICES
(
    ID            LONG AUTO_INCREMENT,
    BRAND_ID      LONG                   NOT NULL,
    START_DATE    TIMESTAMP              NOT NULL,
    END_DATE      TIMESTAMP              NOT NULL,
    PRICE_LIST_ID LONG                   NOT NULL,
    PRODUCT_ID    LONG                   NOT NULL,
    PRIORITY      INTEGER                NOT NULL,
    PRICE         NUMERIC                NOT NULL,
    CURRENCY      VARCHAR_IGNORECASE(10) NOT NULL,
    CREATED_AT    TIMESTAMP,
    UPDATED_AT    TIMESTAMP,
    DELETED_AT    TIMESTAMP,
    PRIMARY KEY (ID),
    FOREIGN KEY (BRAND_ID) REFERENCES BRANDS (ID),
    FOREIGN KEY (PRICE_LIST_ID) REFERENCES PRICES_LIST (ID),
    FOREIGN KEY (PRODUCT_ID) REFERENCES PRODUCTS (ID)
);

INSERT INTO PRICES
(BRAND_ID,
 START_DATE,
 END_DATE,
 PRICE_LIST_ID,
 PRODUCT_ID,
 PRIORITY,
 PRICE,
 CURRENCY,
 CREATED_AT,
 UPDATED_AT,
 DELETED_AT)
VALUES (1,
        '2020-06-14 00:00:00.000',
        '2020-12-31 23:59:59.000',
        1,
        35455,
        0,
        '35.50',
        'EUR',
        '2020-01-01 00:00:00.000',
        '2020-01-01 00:00:00.000',
        NULL),
       (1,
        '2020-06-14 15:00:00.000',
        '2020-06-14 18:30:00.000',
        2,
        35455,
        1,
        '25.45',
        'EUR',
        '2020-01-01 00:00:00.000',
        '2020-01-01 00:00:00.000',
        NULL),
       (1,
        '2020-06-15 00:00:00.000',
        '2020-06-15 11:00:00.000',
        3,
        35455,
        1,
        '30.50',
        'EUR',
        '2020-01-01 00:00:00.000',
        '2020-01-01 00:00:00.000',
        NULL),
       (1,
        '2020-06-15 16:00:00.000',
        '2020-12-31 23:59:59.000',
        4,
        35455,
        1,
        '38.95',
        'EUR',
        '2020-01-01 00:00:00.000',
        '2020-01-01 00:00:00.000',
        NULL);
-- END of >>PRICES TABLE<< creation

-- START of <<PRICES_BY_DATE VIEW>> creation
CREATE VIEW IF NOT EXISTS PRICES_BY_DATE AS
SELECT PRICES.ID         AS ID,       -- Java needs an ID field and it isn't needed by a view.
       PRICES.ID         AS PRICE_ID, -- This field name correlates with app.
       BRANDS.ID         AS BRAND_ID,
       PRICES_LIST.ID    AS PRICE_LIST_ID,
       PRODUCTS.ID       AS PRODUCT_ID,
       PRICES.PRICE      AS PRICE,
       PRICES.START_DATE AS START_DATE,
       PRICES.END_DATE   AS END_DATE,
       BRANDS.NAME       AS BRAND_NAME,
       PRICES_LIST.NAME  AS PRICE_LIST_NAME,
       PRODUCTS.NAME     AS PRODUCT_NAME
FROM PRICES
         JOIN BRANDS
              ON PRICES.BRAND_ID = BRANDS.ID
         JOIN PRICES_LIST
              ON PRICES.PRICE_LIST_ID = PRICES_LIST.ID
         JOIN PRODUCTS
              ON PRICES.PRODUCT_ID = PRODUCTS.ID
ORDER BY PRICES.PRIORITY DESC;
-- END of >>PRICES_BY_DATE VIEW<< creation
