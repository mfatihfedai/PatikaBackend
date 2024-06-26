PGDMP      :                 |            tourismAgency    16.1    16.1 "               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    24955    tourismAgency    DATABASE     �   CREATE DATABASE "tourismAgency" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_Australia.1252';
    DROP DATABASE "tourismAgency";
                admin    false            �            1259    24965    otel    TABLE     �  CREATE TABLE public.otel (
    otel_id bigint NOT NULL,
    otel_name text NOT NULL,
    otel_city text NOT NULL,
    otel_region text NOT NULL,
    otel_address text NOT NULL,
    otel_email text NOT NULL,
    otel_phone text NOT NULL,
    otel_rate text NOT NULL,
    otel_otopark boolean NOT NULL,
    otel_wifi boolean NOT NULL,
    otel_pool boolean NOT NULL,
    otel_fitness boolean NOT NULL,
    otel_concierge boolean NOT NULL,
    otel_spa boolean NOT NULL,
    otel_service boolean NOT NULL
);
    DROP TABLE public.otel;
       public         heap    admin    false            �            1259    24964    admin_role_otel_id_seq    SEQUENCE     �   ALTER TABLE public.otel ALTER COLUMN otel_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.admin_role_otel_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          admin    false    218            �            1259    24981    pension    TABLE     �   CREATE TABLE public.pension (
    pension_id bigint NOT NULL,
    pension_otel_id bigint NOT NULL,
    pension_name text NOT NULL
);
    DROP TABLE public.pension;
       public         heap    admin    false            �            1259    24980    pension_pension_id_seq    SEQUENCE     �   ALTER TABLE public.pension ALTER COLUMN pension_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.pension_pension_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          admin    false    222            �            1259    24995    reservation    TABLE     �  CREATE TABLE public.reservation (
    reservation_id bigint NOT NULL,
    room_id bigint NOT NULL,
    book_name text NOT NULL,
    book_email text NOT NULL,
    book_phone text NOT NULL,
    guest_name text NOT NULL,
    guest_tc text NOT NULL,
    total_price bigint NOT NULL,
    entry_date date NOT NULL,
    exit_date date NOT NULL,
    adult_number bigint NOT NULL,
    child_number bigint NOT NULL
);
    DROP TABLE public.reservation;
       public         heap    admin    false            �            1259    24994    reservation_reservation_id_seq    SEQUENCE     �   ALTER TABLE public.reservation ALTER COLUMN reservation_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.reservation_reservation_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          admin    false    226            �            1259    24989    room    TABLE       CREATE TABLE public.room (
    room_id bigint NOT NULL,
    room_otel_id bigint NOT NULL,
    room_season_id bigint NOT NULL,
    room_pension_id bigint NOT NULL,
    room_stok bigint NOT NULL,
    room_bed bigint NOT NULL,
    room_mtrsqr bigint NOT NULL,
    room_prc_adult bigint NOT NULL,
    room_prc_child bigint NOT NULL,
    room_aircndtn boolean NOT NULL,
    room_minibar boolean NOT NULL,
    room_tv boolean NOT NULL,
    room_safe boolean NOT NULL,
    room_fridge boolean NOT NULL,
    room_type text NOT NULL
);
    DROP TABLE public.room;
       public         heap    admin    false            �            1259    24988    room_room_id_seq    SEQUENCE     �   ALTER TABLE public.room ALTER COLUMN room_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.room_room_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          admin    false    224            �            1259    24973    season    TABLE     �   CREATE TABLE public.season (
    season_id bigint NOT NULL,
    season_otel_id bigint NOT NULL,
    strt_date date NOT NULL,
    fnsh_date date NOT NULL
);
    DROP TABLE public.season;
       public         heap    admin    false            �            1259    24972    season_season_id_seq    SEQUENCE     �   ALTER TABLE public.season ALTER COLUMN season_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.season_season_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          admin    false    220            �            1259    24957    user    TABLE     �   CREATE TABLE public."user" (
    user_id bigint NOT NULL,
    user_name text NOT NULL,
    user_pass text NOT NULL,
    user_role text NOT NULL
);
    DROP TABLE public."user";
       public         heap    admin    false            �            1259    24956    user_user_id_seq    SEQUENCE     �   ALTER TABLE public."user" ALTER COLUMN user_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.user_user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          admin    false    216                      0    24965    otel 
   TABLE DATA           �   COPY public.otel (otel_id, otel_name, otel_city, otel_region, otel_address, otel_email, otel_phone, otel_rate, otel_otopark, otel_wifi, otel_pool, otel_fitness, otel_concierge, otel_spa, otel_service) FROM stdin;
    public          admin    false    218   s)                 0    24981    pension 
   TABLE DATA           L   COPY public.pension (pension_id, pension_otel_id, pension_name) FROM stdin;
    public          admin    false    222   v*                 0    24995    reservation 
   TABLE DATA           �   COPY public.reservation (reservation_id, room_id, book_name, book_email, book_phone, guest_name, guest_tc, total_price, entry_date, exit_date, adult_number, child_number) FROM stdin;
    public          admin    false    226   +                 0    24989    room 
   TABLE DATA           �   COPY public.room (room_id, room_otel_id, room_season_id, room_pension_id, room_stok, room_bed, room_mtrsqr, room_prc_adult, room_prc_child, room_aircndtn, room_minibar, room_tv, room_safe, room_fridge, room_type) FROM stdin;
    public          admin    false    224   �+       	          0    24973    season 
   TABLE DATA           Q   COPY public.season (season_id, season_otel_id, strt_date, fnsh_date) FROM stdin;
    public          admin    false    220   _,                 0    24957    user 
   TABLE DATA           J   COPY public."user" (user_id, user_name, user_pass, user_role) FROM stdin;
    public          admin    false    216   �,                  0    0    admin_role_otel_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.admin_role_otel_id_seq', 6, true);
          public          admin    false    217                       0    0    pension_pension_id_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.pension_pension_id_seq', 14, true);
          public          admin    false    221                       0    0    reservation_reservation_id_seq    SEQUENCE SET     L   SELECT pg_catalog.setval('public.reservation_reservation_id_seq', 7, true);
          public          admin    false    225                       0    0    room_room_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.room_room_id_seq', 19, true);
          public          admin    false    223                       0    0    season_season_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.season_season_id_seq', 8, true);
          public          admin    false    219                       0    0    user_user_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.user_user_id_seq', 11, true);
          public          admin    false    215            l           2606    24971    otel admin_role_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.otel
    ADD CONSTRAINT admin_role_pkey PRIMARY KEY (otel_id);
 >   ALTER TABLE ONLY public.otel DROP CONSTRAINT admin_role_pkey;
       public            admin    false    218            p           2606    24987    pension pension_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.pension
    ADD CONSTRAINT pension_pkey PRIMARY KEY (pension_id);
 >   ALTER TABLE ONLY public.pension DROP CONSTRAINT pension_pkey;
       public            admin    false    222            t           2606    25001    reservation reservation_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.reservation
    ADD CONSTRAINT reservation_pkey PRIMARY KEY (reservation_id);
 F   ALTER TABLE ONLY public.reservation DROP CONSTRAINT reservation_pkey;
       public            admin    false    226            r           2606    24993    room room_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public.room
    ADD CONSTRAINT room_pkey PRIMARY KEY (room_id);
 8   ALTER TABLE ONLY public.room DROP CONSTRAINT room_pkey;
       public            admin    false    224            n           2606    24979    season season_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.season
    ADD CONSTRAINT season_pkey PRIMARY KEY (season_id);
 <   ALTER TABLE ONLY public.season DROP CONSTRAINT season_pkey;
       public            admin    false    220            j           2606    24963    user user_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public."user"
    ADD CONSTRAINT user_pkey PRIMARY KEY (user_id);
 :   ALTER TABLE ONLY public."user" DROP CONSTRAINT user_pkey;
       public            admin    false    216               �   x�e�Mj�@���)� �x�W��Iqp(Đ�]u��Sf�<�$��]v�}v��:N�Z���B�'q(Y���0�5��':�!<�k:�T�3�E٢f���枇3�wA �<�]��n�$ᜇaA������%PRvl��?�e�-H���5(�H���L6։� �ǰ\��7�����5+� G�HAt��E��a�������Mf�Q�N�,�7���������������<�:�o�         ~   x�3�4��))J�H-::/��%1#3��(����W�Y���e���$z'f�%���ep�����H,�<�ܭ4'ǹ(5%��˒�U���)gdbё���b���QE��"�-����� e@�         x   x�M�1�0��_@w�;0]�Ƃ8�+�����"R�]��R\����Yb~���LU�A��B,����M1�D;�N���1�)x�w�[Bli6�b����%�%\D��k�Hܽw��F�%�         �   x�u�;�0���)�W{���کP�@CI�e��B��,�I12L��,n�
�q����Gpב�Fؐu[�)~R=�-��[��N��/�:.��8ͯ��F`[ڧh�� ��q}l�0U�95;��d�q'ق7\��=;T�������u�潌�1���s�ز��輻|�s�����/J�ef"      	   B   x�3�4�4202�50�5�1-�L.c�H*d��dL9MqȘ�e�\#��H�ؐ˂���=... ��m         '   x�3�LJ!W� �HWW.C��Drt�������� ��/     