PGDMP                      |            library    16.1    16.1 B    '           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            (           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            )           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            *           1262    25634    library    DATABASE     ~   CREATE DATABASE library WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_Australia.1252';
    DROP DATABASE library;
                admin    false            �            1259    26088    authors    TABLE     �   CREATE TABLE public.authors (
    author_birthday date NOT NULL,
    author_id bigint NOT NULL,
    author_country character varying(255) NOT NULL,
    author_name character varying(255) NOT NULL
);
    DROP TABLE public.authors;
       public         heap    postgres    false            �            1259    26087    authors_author_id_seq    SEQUENCE     ~   CREATE SEQUENCE public.authors_author_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.authors_author_id_seq;
       public          postgres    false    216            +           0    0    authors_author_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.authors_author_id_seq OWNED BY public.authors.author_id;
          public          postgres    false    215            �            1259    26098 	   book2cats    TABLE     v   CREATE TABLE public.book2cats (
    book2cats_book_id integer NOT NULL,
    book2cats_category_id integer NOT NULL
);
    DROP TABLE public.book2cats;
       public         heap    postgres    false            �            1259    26096    book2cats_book2cats_book_id_seq    SEQUENCE     �   CREATE SEQUENCE public.book2cats_book2cats_book_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 6   DROP SEQUENCE public.book2cats_book2cats_book_id_seq;
       public          postgres    false    219            ,           0    0    book2cats_book2cats_book_id_seq    SEQUENCE OWNED BY     c   ALTER SEQUENCE public.book2cats_book2cats_book_id_seq OWNED BY public.book2cats.book2cats_book_id;
          public          postgres    false    217            �            1259    26097 #   book2cats_book2cats_category_id_seq    SEQUENCE     �   CREATE SEQUENCE public.book2cats_book2cats_category_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 :   DROP SEQUENCE public.book2cats_book2cats_category_id_seq;
       public          postgres    false    219            -           0    0 #   book2cats_book2cats_category_id_seq    SEQUENCE OWNED BY     k   ALTER SEQUENCE public.book2cats_book2cats_category_id_seq OWNED BY public.book2cats.book2cats_category_id;
          public          postgres    false    218            �            1259    26105    book_borrows    TABLE     �   CREATE TABLE public.book_borrows (
    borrow_return_date date,
    borrowing_date date NOT NULL,
    borrow_book_id integer NOT NULL,
    borrow_id bigint NOT NULL,
    borrower_name character varying(255) NOT NULL
);
     DROP TABLE public.book_borrows;
       public         heap    postgres    false            �            1259    26103    book_borrows_borrow_book_id_seq    SEQUENCE     �   CREATE SEQUENCE public.book_borrows_borrow_book_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 6   DROP SEQUENCE public.book_borrows_borrow_book_id_seq;
       public          postgres    false    222            .           0    0    book_borrows_borrow_book_id_seq    SEQUENCE OWNED BY     c   ALTER SEQUENCE public.book_borrows_borrow_book_id_seq OWNED BY public.book_borrows.borrow_book_id;
          public          postgres    false    220            �            1259    26104    book_borrows_borrow_id_seq    SEQUENCE     �   CREATE SEQUENCE public.book_borrows_borrow_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.book_borrows_borrow_id_seq;
       public          postgres    false    222            /           0    0    book_borrows_borrow_id_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.book_borrows_borrow_id_seq OWNED BY public.book_borrows.borrow_id;
          public          postgres    false    221            �            1259    26115    books    TABLE       CREATE TABLE public.books (
    book_publication_year integer NOT NULL,
    book_stock integer NOT NULL,
    book_author_id integer NOT NULL,
    book_id bigint NOT NULL,
    book_publisher_id integer NOT NULL,
    book_name character varying(255) NOT NULL
);
    DROP TABLE public.books;
       public         heap    postgres    false            �            1259    26112    books_book_author_id_seq    SEQUENCE     �   CREATE SEQUENCE public.books_book_author_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.books_book_author_id_seq;
       public          postgres    false    226            0           0    0    books_book_author_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.books_book_author_id_seq OWNED BY public.books.book_author_id;
          public          postgres    false    223            �            1259    26113    books_book_id_seq    SEQUENCE     z   CREATE SEQUENCE public.books_book_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.books_book_id_seq;
       public          postgres    false    226            1           0    0    books_book_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.books_book_id_seq OWNED BY public.books.book_id;
          public          postgres    false    224            �            1259    26114    books_book_publisher_id_seq    SEQUENCE     �   CREATE SEQUENCE public.books_book_publisher_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.books_book_publisher_id_seq;
       public          postgres    false    226            2           0    0    books_book_publisher_id_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.books_book_publisher_id_seq OWNED BY public.books.book_publisher_id;
          public          postgres    false    225            �            1259    26124 
   categories    TABLE     �   CREATE TABLE public.categories (
    category_id bigint NOT NULL,
    category_definition character varying(255) NOT NULL,
    category_name character varying(255) NOT NULL
);
    DROP TABLE public.categories;
       public         heap    postgres    false            �            1259    26123    categories_category_id_seq    SEQUENCE     �   CREATE SEQUENCE public.categories_category_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.categories_category_id_seq;
       public          postgres    false    228            3           0    0    categories_category_id_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.categories_category_id_seq OWNED BY public.categories.category_id;
          public          postgres    false    227            �            1259    26133 
   publishers    TABLE     �   CREATE TABLE public.publishers (
    publisher_establishment_year integer NOT NULL,
    publisher_id bigint NOT NULL,
    publisher_address character varying(255) NOT NULL,
    publisher_name character varying(255) NOT NULL
);
    DROP TABLE public.publishers;
       public         heap    postgres    false            �            1259    26132    publishers_publisher_id_seq    SEQUENCE     �   CREATE SEQUENCE public.publishers_publisher_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.publishers_publisher_id_seq;
       public          postgres    false    230            4           0    0    publishers_publisher_id_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.publishers_publisher_id_seq OWNED BY public.publishers.publisher_id;
          public          postgres    false    229            m           2604    26091    authors author_id    DEFAULT     v   ALTER TABLE ONLY public.authors ALTER COLUMN author_id SET DEFAULT nextval('public.authors_author_id_seq'::regclass);
 @   ALTER TABLE public.authors ALTER COLUMN author_id DROP DEFAULT;
       public          postgres    false    216    215    216            n           2604    26101    book2cats book2cats_book_id    DEFAULT     �   ALTER TABLE ONLY public.book2cats ALTER COLUMN book2cats_book_id SET DEFAULT nextval('public.book2cats_book2cats_book_id_seq'::regclass);
 J   ALTER TABLE public.book2cats ALTER COLUMN book2cats_book_id DROP DEFAULT;
       public          postgres    false    217    219    219            o           2604    26102    book2cats book2cats_category_id    DEFAULT     �   ALTER TABLE ONLY public.book2cats ALTER COLUMN book2cats_category_id SET DEFAULT nextval('public.book2cats_book2cats_category_id_seq'::regclass);
 N   ALTER TABLE public.book2cats ALTER COLUMN book2cats_category_id DROP DEFAULT;
       public          postgres    false    219    218    219            p           2604    26108    book_borrows borrow_book_id    DEFAULT     �   ALTER TABLE ONLY public.book_borrows ALTER COLUMN borrow_book_id SET DEFAULT nextval('public.book_borrows_borrow_book_id_seq'::regclass);
 J   ALTER TABLE public.book_borrows ALTER COLUMN borrow_book_id DROP DEFAULT;
       public          postgres    false    220    222    222            q           2604    26109    book_borrows borrow_id    DEFAULT     �   ALTER TABLE ONLY public.book_borrows ALTER COLUMN borrow_id SET DEFAULT nextval('public.book_borrows_borrow_id_seq'::regclass);
 E   ALTER TABLE public.book_borrows ALTER COLUMN borrow_id DROP DEFAULT;
       public          postgres    false    221    222    222            r           2604    26118    books book_author_id    DEFAULT     |   ALTER TABLE ONLY public.books ALTER COLUMN book_author_id SET DEFAULT nextval('public.books_book_author_id_seq'::regclass);
 C   ALTER TABLE public.books ALTER COLUMN book_author_id DROP DEFAULT;
       public          postgres    false    226    223    226            s           2604    26119    books book_id    DEFAULT     n   ALTER TABLE ONLY public.books ALTER COLUMN book_id SET DEFAULT nextval('public.books_book_id_seq'::regclass);
 <   ALTER TABLE public.books ALTER COLUMN book_id DROP DEFAULT;
       public          postgres    false    226    224    226            t           2604    26120    books book_publisher_id    DEFAULT     �   ALTER TABLE ONLY public.books ALTER COLUMN book_publisher_id SET DEFAULT nextval('public.books_book_publisher_id_seq'::regclass);
 F   ALTER TABLE public.books ALTER COLUMN book_publisher_id DROP DEFAULT;
       public          postgres    false    225    226    226            u           2604    26127    categories category_id    DEFAULT     �   ALTER TABLE ONLY public.categories ALTER COLUMN category_id SET DEFAULT nextval('public.categories_category_id_seq'::regclass);
 E   ALTER TABLE public.categories ALTER COLUMN category_id DROP DEFAULT;
       public          postgres    false    227    228    228            v           2604    26136    publishers publisher_id    DEFAULT     �   ALTER TABLE ONLY public.publishers ALTER COLUMN publisher_id SET DEFAULT nextval('public.publishers_publisher_id_seq'::regclass);
 F   ALTER TABLE public.publishers ALTER COLUMN publisher_id DROP DEFAULT;
       public          postgres    false    229    230    230                      0    26088    authors 
   TABLE DATA           Z   COPY public.authors (author_birthday, author_id, author_country, author_name) FROM stdin;
    public          postgres    false    216   �N                 0    26098 	   book2cats 
   TABLE DATA           M   COPY public.book2cats (book2cats_book_id, book2cats_category_id) FROM stdin;
    public          postgres    false    219   �N                 0    26105    book_borrows 
   TABLE DATA           t   COPY public.book_borrows (borrow_return_date, borrowing_date, borrow_book_id, borrow_id, borrower_name) FROM stdin;
    public          postgres    false    222   �N                  0    26115    books 
   TABLE DATA           y   COPY public.books (book_publication_year, book_stock, book_author_id, book_id, book_publisher_id, book_name) FROM stdin;
    public          postgres    false    226   ,O       "          0    26124 
   categories 
   TABLE DATA           U   COPY public.categories (category_id, category_definition, category_name) FROM stdin;
    public          postgres    false    228   eO       $          0    26133 
   publishers 
   TABLE DATA           s   COPY public.publishers (publisher_establishment_year, publisher_id, publisher_address, publisher_name) FROM stdin;
    public          postgres    false    230   /P       5           0    0    authors_author_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.authors_author_id_seq', 1, true);
          public          postgres    false    215            6           0    0    book2cats_book2cats_book_id_seq    SEQUENCE SET     N   SELECT pg_catalog.setval('public.book2cats_book2cats_book_id_seq', 1, false);
          public          postgres    false    217            7           0    0 #   book2cats_book2cats_category_id_seq    SEQUENCE SET     R   SELECT pg_catalog.setval('public.book2cats_book2cats_category_id_seq', 1, false);
          public          postgres    false    218            8           0    0    book_borrows_borrow_book_id_seq    SEQUENCE SET     N   SELECT pg_catalog.setval('public.book_borrows_borrow_book_id_seq', 1, false);
          public          postgres    false    220            9           0    0    book_borrows_borrow_id_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.book_borrows_borrow_id_seq', 1, true);
          public          postgres    false    221            :           0    0    books_book_author_id_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.books_book_author_id_seq', 1, false);
          public          postgres    false    223            ;           0    0    books_book_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.books_book_id_seq', 1, true);
          public          postgres    false    224            <           0    0    books_book_publisher_id_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.books_book_publisher_id_seq', 1, false);
          public          postgres    false    225            =           0    0    categories_category_id_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.categories_category_id_seq', 2, true);
          public          postgres    false    227            >           0    0    publishers_publisher_id_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.publishers_publisher_id_seq', 1, true);
          public          postgres    false    229            x           2606    26095    authors authors_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.authors
    ADD CONSTRAINT authors_pkey PRIMARY KEY (author_id);
 >   ALTER TABLE ONLY public.authors DROP CONSTRAINT authors_pkey;
       public            postgres    false    216            z           2606    26111    book_borrows book_borrows_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.book_borrows
    ADD CONSTRAINT book_borrows_pkey PRIMARY KEY (borrow_id);
 H   ALTER TABLE ONLY public.book_borrows DROP CONSTRAINT book_borrows_pkey;
       public            postgres    false    222            |           2606    26122    books books_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.books
    ADD CONSTRAINT books_pkey PRIMARY KEY (book_id);
 :   ALTER TABLE ONLY public.books DROP CONSTRAINT books_pkey;
       public            postgres    false    226            ~           2606    26131    categories categories_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.categories
    ADD CONSTRAINT categories_pkey PRIMARY KEY (category_id);
 D   ALTER TABLE ONLY public.categories DROP CONSTRAINT categories_pkey;
       public            postgres    false    228            �           2606    26140    publishers publishers_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.publishers
    ADD CONSTRAINT publishers_pkey PRIMARY KEY (publisher_id);
 D   ALTER TABLE ONLY public.publishers DROP CONSTRAINT publishers_pkey;
       public            postgres    false    230            �           2606    26151 (   book_borrows fk2upjgtw1jfrmu749gxllrrdvo    FK CONSTRAINT     �   ALTER TABLE ONLY public.book_borrows
    ADD CONSTRAINT fk2upjgtw1jfrmu749gxllrrdvo FOREIGN KEY (borrow_book_id) REFERENCES public.books(book_id);
 R   ALTER TABLE ONLY public.book_borrows DROP CONSTRAINT fk2upjgtw1jfrmu749gxllrrdvo;
       public          postgres    false    222    4732    226            �           2606    26156 !   books fk44cp76hd0fv4lg6cbdruskfvn    FK CONSTRAINT     �   ALTER TABLE ONLY public.books
    ADD CONSTRAINT fk44cp76hd0fv4lg6cbdruskfvn FOREIGN KEY (book_author_id) REFERENCES public.authors(author_id);
 K   ALTER TABLE ONLY public.books DROP CONSTRAINT fk44cp76hd0fv4lg6cbdruskfvn;
       public          postgres    false    4728    216    226            �           2606    26161 !   books fk53bw245gmvw9eamjbtwgrxuj3    FK CONSTRAINT     �   ALTER TABLE ONLY public.books
    ADD CONSTRAINT fk53bw245gmvw9eamjbtwgrxuj3 FOREIGN KEY (book_publisher_id) REFERENCES public.publishers(publisher_id);
 K   ALTER TABLE ONLY public.books DROP CONSTRAINT fk53bw245gmvw9eamjbtwgrxuj3;
       public          postgres    false    230    226    4736            �           2606    26146 %   book2cats fkc2rwf9haijffc43owjkos9ihm    FK CONSTRAINT     �   ALTER TABLE ONLY public.book2cats
    ADD CONSTRAINT fkc2rwf9haijffc43owjkos9ihm FOREIGN KEY (book2cats_book_id) REFERENCES public.books(book_id);
 O   ALTER TABLE ONLY public.book2cats DROP CONSTRAINT fkc2rwf9haijffc43owjkos9ihm;
       public          postgres    false    219    4732    226            �           2606    26141 %   book2cats fkkn13gg7xspl0d47u0yuatcjk9    FK CONSTRAINT     �   ALTER TABLE ONLY public.book2cats
    ADD CONSTRAINT fkkn13gg7xspl0d47u0yuatcjk9 FOREIGN KEY (book2cats_category_id) REFERENCES public.categories(category_id);
 O   ALTER TABLE ONLY public.book2cats DROP CONSTRAINT fkkn13gg7xspl0d47u0yuatcjk9;
       public          postgres    false    4734    219    228               +   x�3�47�50"NCN��Ԣ���<N��<����<�=... �.	G            x�3�4�2�4����� ��         '   x�3�47�50"NC$&�%�df(���$fr��qqq � �          )   x�3200�4�4Ð�T�D��̼�L���T�=... �`;      "   �   x�-��m�0D��)n �@�A��aeZ"���8���~�q8����I	ѧc7uF'3
9��W��ƽD��.�Z;a�;��^�+�`�Év�$*\����5fLM��L�zpK��׻{!��X";Q�#*6�Og��x�ɰ�]��m�V)��Aw�����s��6��y�ٗ���gI)�ް]�      $   /   x�3200�4�<���$1/�4G�)�2����R΀�����b�=... �     