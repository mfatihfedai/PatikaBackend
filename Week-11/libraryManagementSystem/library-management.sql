PGDMP                      |            library-restapi    16.1    16.1 A    &           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            '           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            (           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            )           1262    26548    library-restapi    DATABASE     �   CREATE DATABASE "library-restapi" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_Australia.1252';
 !   DROP DATABASE "library-restapi";
                admin    false            �            1259    26568    authors    TABLE     �   CREATE TABLE public.authors (
    author_id bigint NOT NULL,
    author_birthday date NOT NULL,
    author_country character varying(255) NOT NULL,
    author_name character varying(255) NOT NULL
);
    DROP TABLE public.authors;
       public         heap    postgres    false            �            1259    26567    authors_author_id_seq    SEQUENCE     ~   CREATE SEQUENCE public.authors_author_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.authors_author_id_seq;
       public          postgres    false    220            *           0    0    authors_author_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.authors_author_id_seq OWNED BY public.authors.author_id;
          public          postgres    false    219            �            1259    26592 	   book2cats    TABLE     v   CREATE TABLE public.book2cats (
    book2cats_book_id integer NOT NULL,
    book2cats_category_id integer NOT NULL
);
    DROP TABLE public.book2cats;
       public         heap    postgres    false            �            1259    26590    book2cats_book2cats_book_id_seq    SEQUENCE     �   CREATE SEQUENCE public.book2cats_book2cats_book_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 6   DROP SEQUENCE public.book2cats_book2cats_book_id_seq;
       public          postgres    false    227            +           0    0    book2cats_book2cats_book_id_seq    SEQUENCE OWNED BY     c   ALTER SEQUENCE public.book2cats_book2cats_book_id_seq OWNED BY public.book2cats.book2cats_book_id;
          public          postgres    false    225            �            1259    26591 #   book2cats_book2cats_category_id_seq    SEQUENCE     �   CREATE SEQUENCE public.book2cats_book2cats_category_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 :   DROP SEQUENCE public.book2cats_book2cats_category_id_seq;
       public          postgres    false    227            ,           0    0 #   book2cats_book2cats_category_id_seq    SEQUENCE OWNED BY     k   ALTER SEQUENCE public.book2cats_book2cats_category_id_seq OWNED BY public.book2cats.book2cats_category_id;
          public          postgres    false    226            �            1259    26577    book_borrows    TABLE     �   CREATE TABLE public.book_borrows (
    borrow_id integer NOT NULL,
    borrower_name character varying(255) NOT NULL,
    borrowing_date date NOT NULL,
    borrow_return_date date NOT NULL,
    borrow_book_id integer NOT NULL
);
     DROP TABLE public.book_borrows;
       public         heap    postgres    false            �            1259    26597    book_borrows_borrow_book_id_seq    SEQUENCE     �   CREATE SEQUENCE public.book_borrows_borrow_book_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 6   DROP SEQUENCE public.book_borrows_borrow_book_id_seq;
       public          postgres    false    222            -           0    0    book_borrows_borrow_book_id_seq    SEQUENCE OWNED BY     c   ALTER SEQUENCE public.book_borrows_borrow_book_id_seq OWNED BY public.book_borrows.borrow_book_id;
          public          postgres    false    228            �            1259    26576    book_borrows_borrow_id_seq    SEQUENCE     �   CREATE SEQUENCE public.book_borrows_borrow_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.book_borrows_borrow_id_seq;
       public          postgres    false    222            .           0    0    book_borrows_borrow_id_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.book_borrows_borrow_id_seq OWNED BY public.book_borrows.borrow_id;
          public          postgres    false    221            �            1259    26584    books    TABLE       CREATE TABLE public.books (
    book_id integer NOT NULL,
    book_name character varying(255) NOT NULL,
    book_publication_year integer NOT NULL,
    book_stock integer NOT NULL,
    book_author_id integer NOT NULL,
    book_publisher_id integer NOT NULL
);
    DROP TABLE public.books;
       public         heap    postgres    false            �            1259    26603    books_book_author_id_seq    SEQUENCE     �   CREATE SEQUENCE public.books_book_author_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.books_book_author_id_seq;
       public          postgres    false    224            /           0    0    books_book_author_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.books_book_author_id_seq OWNED BY public.books.book_author_id;
          public          postgres    false    229            �            1259    26583    books_book_id_seq    SEQUENCE     �   CREATE SEQUENCE public.books_book_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.books_book_id_seq;
       public          postgres    false    224            0           0    0    books_book_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.books_book_id_seq OWNED BY public.books.book_id;
          public          postgres    false    223            �            1259    26609    books_book_publisher_id_seq    SEQUENCE     �   CREATE SEQUENCE public.books_book_publisher_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.books_book_publisher_id_seq;
       public          postgres    false    224            1           0    0    books_book_publisher_id_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.books_book_publisher_id_seq OWNED BY public.books.book_publisher_id;
          public          postgres    false    230            �            1259    26550 
   categories    TABLE     �   CREATE TABLE public.categories (
    category_id integer NOT NULL,
    category_definiton character varying(255),
    category_name character varying(255) NOT NULL
);
    DROP TABLE public.categories;
       public         heap    postgres    false            �            1259    26549    categories_category_id_seq    SEQUENCE     �   CREATE SEQUENCE public.categories_category_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.categories_category_id_seq;
       public          postgres    false    216            2           0    0    categories_category_id_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.categories_category_id_seq OWNED BY public.categories.category_id;
          public          postgres    false    215            �            1259    26559 
   publishers    TABLE     �   CREATE TABLE public.publishers (
    publisher_id integer NOT NULL,
    publisher_address character varying(255) NOT NULL,
    publisher_establishment_year integer NOT NULL,
    publisher_name character varying(255) NOT NULL
);
    DROP TABLE public.publishers;
       public         heap    postgres    false            �            1259    26558    publishers_publisher_id_seq    SEQUENCE     �   CREATE SEQUENCE public.publishers_publisher_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.publishers_publisher_id_seq;
       public          postgres    false    218            3           0    0    publishers_publisher_id_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.publishers_publisher_id_seq OWNED BY public.publishers.publisher_id;
          public          postgres    false    217            o           2604    26571    authors author_id    DEFAULT     v   ALTER TABLE ONLY public.authors ALTER COLUMN author_id SET DEFAULT nextval('public.authors_author_id_seq'::regclass);
 @   ALTER TABLE public.authors ALTER COLUMN author_id DROP DEFAULT;
       public          postgres    false    219    220    220            u           2604    26595    book2cats book2cats_book_id    DEFAULT     �   ALTER TABLE ONLY public.book2cats ALTER COLUMN book2cats_book_id SET DEFAULT nextval('public.book2cats_book2cats_book_id_seq'::regclass);
 J   ALTER TABLE public.book2cats ALTER COLUMN book2cats_book_id DROP DEFAULT;
       public          postgres    false    227    225    227            v           2604    26596    book2cats book2cats_category_id    DEFAULT     �   ALTER TABLE ONLY public.book2cats ALTER COLUMN book2cats_category_id SET DEFAULT nextval('public.book2cats_book2cats_category_id_seq'::regclass);
 N   ALTER TABLE public.book2cats ALTER COLUMN book2cats_category_id DROP DEFAULT;
       public          postgres    false    226    227    227            p           2604    26580    book_borrows borrow_id    DEFAULT     �   ALTER TABLE ONLY public.book_borrows ALTER COLUMN borrow_id SET DEFAULT nextval('public.book_borrows_borrow_id_seq'::regclass);
 E   ALTER TABLE public.book_borrows ALTER COLUMN borrow_id DROP DEFAULT;
       public          postgres    false    221    222    222            q           2604    26598    book_borrows borrow_book_id    DEFAULT     �   ALTER TABLE ONLY public.book_borrows ALTER COLUMN borrow_book_id SET DEFAULT nextval('public.book_borrows_borrow_book_id_seq'::regclass);
 J   ALTER TABLE public.book_borrows ALTER COLUMN borrow_book_id DROP DEFAULT;
       public          postgres    false    228    222            r           2604    26587    books book_id    DEFAULT     n   ALTER TABLE ONLY public.books ALTER COLUMN book_id SET DEFAULT nextval('public.books_book_id_seq'::regclass);
 <   ALTER TABLE public.books ALTER COLUMN book_id DROP DEFAULT;
       public          postgres    false    223    224    224            s           2604    26604    books book_author_id    DEFAULT     |   ALTER TABLE ONLY public.books ALTER COLUMN book_author_id SET DEFAULT nextval('public.books_book_author_id_seq'::regclass);
 C   ALTER TABLE public.books ALTER COLUMN book_author_id DROP DEFAULT;
       public          postgres    false    229    224            t           2604    26610    books book_publisher_id    DEFAULT     �   ALTER TABLE ONLY public.books ALTER COLUMN book_publisher_id SET DEFAULT nextval('public.books_book_publisher_id_seq'::regclass);
 F   ALTER TABLE public.books ALTER COLUMN book_publisher_id DROP DEFAULT;
       public          postgres    false    230    224            m           2604    26553    categories category_id    DEFAULT     �   ALTER TABLE ONLY public.categories ALTER COLUMN category_id SET DEFAULT nextval('public.categories_category_id_seq'::regclass);
 E   ALTER TABLE public.categories ALTER COLUMN category_id DROP DEFAULT;
       public          postgres    false    216    215    216            n           2604    26562    publishers publisher_id    DEFAULT     �   ALTER TABLE ONLY public.publishers ALTER COLUMN publisher_id SET DEFAULT nextval('public.publishers_publisher_id_seq'::regclass);
 F   ALTER TABLE public.publishers ALTER COLUMN publisher_id DROP DEFAULT;
       public          postgres    false    218    217    218                      0    26568    authors 
   TABLE DATA           Z   COPY public.authors (author_id, author_birthday, author_country, author_name) FROM stdin;
    public          postgres    false    220   7M                  0    26592 	   book2cats 
   TABLE DATA           M   COPY public.book2cats (book2cats_book_id, book2cats_category_id) FROM stdin;
    public          postgres    false    227   �M                 0    26577    book_borrows 
   TABLE DATA           t   COPY public.book_borrows (borrow_id, borrower_name, borrowing_date, borrow_return_date, borrow_book_id) FROM stdin;
    public          postgres    false    222   �M                 0    26584    books 
   TABLE DATA           y   COPY public.books (book_id, book_name, book_publication_year, book_stock, book_author_id, book_publisher_id) FROM stdin;
    public          postgres    false    224   N                 0    26550 
   categories 
   TABLE DATA           T   COPY public.categories (category_id, category_definiton, category_name) FROM stdin;
    public          postgres    false    216   DN                 0    26559 
   publishers 
   TABLE DATA           s   COPY public.publishers (publisher_id, publisher_address, publisher_establishment_year, publisher_name) FROM stdin;
    public          postgres    false    218   �N       4           0    0    authors_author_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.authors_author_id_seq', 6, true);
          public          postgres    false    219            5           0    0    book2cats_book2cats_book_id_seq    SEQUENCE SET     N   SELECT pg_catalog.setval('public.book2cats_book2cats_book_id_seq', 1, false);
          public          postgres    false    225            6           0    0 #   book2cats_book2cats_category_id_seq    SEQUENCE SET     R   SELECT pg_catalog.setval('public.book2cats_book2cats_category_id_seq', 1, false);
          public          postgres    false    226            7           0    0    book_borrows_borrow_book_id_seq    SEQUENCE SET     M   SELECT pg_catalog.setval('public.book_borrows_borrow_book_id_seq', 3, true);
          public          postgres    false    228            8           0    0    book_borrows_borrow_id_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.book_borrows_borrow_id_seq', 5, true);
          public          postgres    false    221            9           0    0    books_book_author_id_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.books_book_author_id_seq', 1, false);
          public          postgres    false    229            :           0    0    books_book_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.books_book_id_seq', 10, true);
          public          postgres    false    223            ;           0    0    books_book_publisher_id_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.books_book_publisher_id_seq', 1, false);
          public          postgres    false    230            <           0    0    categories_category_id_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.categories_category_id_seq', 5, true);
          public          postgres    false    215            =           0    0    publishers_publisher_id_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.publishers_publisher_id_seq', 5, true);
          public          postgres    false    217            |           2606    26575    authors authors_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.authors
    ADD CONSTRAINT authors_pkey PRIMARY KEY (author_id);
 >   ALTER TABLE ONLY public.authors DROP CONSTRAINT authors_pkey;
       public            postgres    false    220            ~           2606    26582    book_borrows book_borrows_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.book_borrows
    ADD CONSTRAINT book_borrows_pkey PRIMARY KEY (borrow_id);
 H   ALTER TABLE ONLY public.book_borrows DROP CONSTRAINT book_borrows_pkey;
       public            postgres    false    222            �           2606    26589    books books_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.books
    ADD CONSTRAINT books_pkey PRIMARY KEY (book_id);
 :   ALTER TABLE ONLY public.books DROP CONSTRAINT books_pkey;
       public            postgres    false    224            x           2606    26557    categories categories_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.categories
    ADD CONSTRAINT categories_pkey PRIMARY KEY (category_id);
 D   ALTER TABLE ONLY public.categories DROP CONSTRAINT categories_pkey;
       public            postgres    false    216            z           2606    26566    publishers publishers_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.publishers
    ADD CONSTRAINT publishers_pkey PRIMARY KEY (publisher_id);
 D   ALTER TABLE ONLY public.publishers DROP CONSTRAINT publishers_pkey;
       public            postgres    false    218            �           2606    26630 !   books fk44cp76hd0fv4lg6cbdruskfvn    FK CONSTRAINT     �   ALTER TABLE ONLY public.books
    ADD CONSTRAINT fk44cp76hd0fv4lg6cbdruskfvn FOREIGN KEY (book_author_id) REFERENCES public.authors(author_id);
 K   ALTER TABLE ONLY public.books DROP CONSTRAINT fk44cp76hd0fv4lg6cbdruskfvn;
       public          postgres    false    220    4732    224            �           2606    26635 !   books fk53bw245gmvw9eamjbtwgrxuj3    FK CONSTRAINT     �   ALTER TABLE ONLY public.books
    ADD CONSTRAINT fk53bw245gmvw9eamjbtwgrxuj3 FOREIGN KEY (book_publisher_id) REFERENCES public.publishers(publisher_id);
 K   ALTER TABLE ONLY public.books DROP CONSTRAINT fk53bw245gmvw9eamjbtwgrxuj3;
       public          postgres    false    4730    218    224            �           2606    26620 %   book2cats fkc2rwf9haijffc43owjkos9ihm    FK CONSTRAINT     �   ALTER TABLE ONLY public.book2cats
    ADD CONSTRAINT fkc2rwf9haijffc43owjkos9ihm FOREIGN KEY (book2cats_book_id) REFERENCES public.books(book_id);
 O   ALTER TABLE ONLY public.book2cats DROP CONSTRAINT fkc2rwf9haijffc43owjkos9ihm;
       public          postgres    false    4736    227    224            �           2606    26615 %   book2cats fkkn13gg7xspl0d47u0yuatcjk9    FK CONSTRAINT     �   ALTER TABLE ONLY public.book2cats
    ADD CONSTRAINT fkkn13gg7xspl0d47u0yuatcjk9 FOREIGN KEY (book2cats_category_id) REFERENCES public.categories(category_id);
 O   ALTER TABLE ONLY public.book2cats DROP CONSTRAINT fkkn13gg7xspl0d47u0yuatcjk9;
       public          postgres    false    227    4728    216               E   x�3�4��4�50�50�tO-�M̫�K���2�X��d\��s�R8�&�$LqI�ᒈ���� 6��             x������ � �         J   x�3�K��T�N��M��4202�50�50�2-�L.#dU
���%����d��b�eH���\�D������� h (x         1   x�3���,I,PpL9��������Ѐӈӈ���	�1��!���� Y�Y         R   x�3��N,IM�/�TH<���������#��$R�|c.S��Ds���T�ޓ������������2&U��W� ��N         6   x�3�tL)J-VH�I�;�ш�����3 �$3;Q/%��˘��	yS�1z\\\ �)     