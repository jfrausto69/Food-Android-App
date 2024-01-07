package com.example.foodapp.DataAccess;

import com.example.foodapp.Models.Complement;
import com.example.foodapp.Models.Drink;
import com.example.foodapp.Models.Food;
import com.example.foodapp.Models.Restaurant;

public class Data {
    public static Restaurant[] restaurants = {
            new Restaurant("McDonald's"), // ID: 1
            new Restaurant("Burger King"), // ID: 2
            new Restaurant("KFC"), // ID: 3
            new Restaurant("Pizza Hut"), // ID: 4
            new Restaurant("Domino's Pizza")}; // ID: 5

    public static Food[] foods = {
            // Comidas para McDonald's (ID: 1)
            new Food("Big Mac", "https://s7d1.scene7.com/is/image/mcdonalds/t-mcdonalds-big-mac-bacon:1-3-product-tile-desktop?wid=829&hei=515&dpr=off",
                    "Dos hamburguesas de carne 100% pura con salsa Big Mac en medio de un pan de sésamo. Se completa con pepinillos, lechuga crujiente, cebolla finamente picada y queso americano.", 2.99, 1),
            new Food("Quarter Pounder con Queso", "https://s7d1.scene7.com/is/image/mcdonalds/DC_202201_0007-005_QuarterPounderwithCheese_832x472:1-3-product-tile-desktop?wid=765&hei=472&dpr=off",
                    "Un cuarto de libra de carne 100% pura con dos lonchas de queso, cebolla, pepinillos y kétchup en un pan tostado.", 3.79, 1),
            new Food("Chicken McNuggets (10 piezas)", "https://cache-backend-mcd.mcdonaldscupones.com/media/image/product$McNuggets-SinRef.png/200/200/original?country=mx",
                    "Diez tiernos y deliciosos Chicken McNuggets hechos con carne de pollo blanca.", 4.49, 1),
            new Food("McChicken", "https://s7d1.scene7.com/is/image/mcdonalds/Header_McChicken_832x472:1-3-product-tile-desktop?wid=763&hei=472&dpr=off",
                    "Una hamburguesa de pollo crujiente con mayonesa, lechuga rallada y un pan.", 1.29, 1),
            new Food("Papas Fritas (Mediano)", "https://cache-backend-mcd.mcdonaldscupones.com/media/image/product$papas-medianas.png/200/200/original?country=mx",
                    "Papas fritas doradas, crujientes y perfectamente saladas.", 1.89, 1),

            // Comidas para Burger King (ID: 2)
            new Food("Whopper", "https://s3.eu-central-1.amazonaws.com/www.burgerking.com.mx/wp-content/uploads/sites/3/2021/02/24095531/1200x800_02_Whopper-1-1.png",
                    "Hamburguesa de carne a la parrilla con tomate, lechuga, mayonesa, kétchup, pepinillos y cebolla en un pan de sésamo.", 4.49, 2),
            new Food("Chicken Fries", "https://media-cldnry.s-nbcnews.com/image/upload/rockcms/2023-07/burger-king-zz-230724-01-9e961b.jpg",
                    "Tiras de pollo empanizadas y sazonadas en forma de papas fritas, servidas con tu elección de salsa.", 3.49, 2),
            new Food("BK Veggie Burger", "https://www.diariodesevilla.es/2021/10/23/sociedad/nutricional-Long-Vegetal-Burguer-King_1622548064_145966564_1200x675.jpg",
                    "Una hamburguesa a la parrilla a base de plantas con lechuga, tomate, cebolla, kétchup y mayonesa en un pan de sésamo.", 4.99, 2),
            new Food("Palitos de Tostada Francesa (5 piezas)", "https://website.menu.app/app/uploads/sites/40/FRENCH-TOAST-01_0-1.png",
                    "Cinco palitos de tostada francesa calientes y dulces.", 2.49, 2),
            new Food("Aros de Cebolla", "https://s3.eu-central-1.amazonaws.com/www.burgerking.com.mx/wp-content/uploads/sites/3/2021/02/24091710/1200x800_05_ArosDeCebolla-2-1.png",
                    "Aros de cebolla crujientes y dorados que son un excelente acompañamiento.", 2.29, 2),

            // KFC
            new Food("Original Recipe Chicken", "https://i.pinimg.com/474x/8a/f6/d0/8af6d029e1126bfcf3f653402b242a0b.jpg",
                    "Pollo crujiente frito con la receta original de KFC.", 5.99, 3),
            new Food("Zinger Burger", "https://images.ctfassets.net/crbk84xktnsl/4zgRg2g2ZRBey10D3qfjyZ/e9f079f486f401b884ad570be0a48af8/Zinger_Burger.png",
                    "Una hamburguesa de pollo picante con lechuga y mayonesa en un pan de hamburguesa.", 4.99, 3),
            new Food("Twister Wrap", "https://www.wtaj.com/wp-content/uploads/sites/69/2023/02/2-KFC-Wraps-Image-2.jpg?w=1280",
                    "Tortilla rellena de pollo, lechuga, tomate, cebolla y salsa.", 3.99, 3),
            new Food("Mashed Potatoes", "https://www.acrff.ps/kfc/sites/default/files/styles/product_page/public/product_image/MASHEDPOTATO%20copy.jpg?itok=clJ-oDJx",
                    "Puré de papas con salsa de pollo.", 1.99, 3),
            new Food("Cole Slaw", "https://qph.cf2.quoracdn.net/main-qimg-d617742ea38a65c1dc13ec43b4d9ec62-lq",
                    "Ensalada de col rallada y zanahorias con aderezo cremoso.", 1.49, 3),
            // Pizza Hut
            new Food("Pepperoni Pizza", "https://images.pizzahut.es/Products/Original/ph_pepperonilovers_detail-1698.jpg",
                    "Pizza con salsa de tomate, queso mozzarella y abundantes rodajas de pepperoni.", 12.99, 4),
            new Food("Hawaiian Pizza", "https://api.pizzahut.io/v1/content/images/pizza/hawaiian.fc03446222211e25b145a5109fb3f555.1.jpg",
                    "Pizza con salsa de tomate, queso mozzarella, jamón y piña.", 11.99, 4),
            new Food("Supreme Pizza", "https://images.pizzahut.es/Products/Original/ph_supreme_detail-1714.jpg",
                    "Pizza con salsa de tomate, queso mozzarella, pepperoni, jamón, champiñones, pimientos verdes y cebolla.", 13.99, 4),
            new Food("Cheese Sticks", "https://api.pizzahut.io/v1/content/en-ca/ca-1/images/side/side.breadsticks.26b3b1ecb8a49b6a3c9084692691a8a8.1.jpg",
                    "Palitos de masa con queso mozzarella y servidos con salsa marinara.", 5.99, 4),
            new Food("Cinnamon Sticks", "https://i.pinimg.com/736x/0d/99/ff/0d99ff6109897d667ef672d12f586acc.jpg",
                    "Palitos de canela glaseados con azúcar y canela, servidos con glaseado de crema de queso.", 4.99, 4),
            // Domino's Pizza
            new Food("Pepperoni Pizza", "https://media-cdn.tripadvisor.com/media/photo-s/10/f9/35/2f/large-pepperoni-pizza.jpg",
                    "Pizza con salsa de tomate, queso mozzarella y rodajas de pepperoni.", 11.99, 5),
            new Food("Margarita Pizza", "https://www.dominos.com.au/ManagedAssets/AU/product/P301/AU_P301_en_hero_4055.jpg?v-1013096145",
                    "Pizza con salsa de tomate, queso mozzarella y albahaca fresca.", 10.99, 5),
            new Food("Hawaiian Pizza", "https://www.dominos.com.au/ManagedAssets/AU/product/P005/AU_P005_en_hero_4055.jpg?v692091788",
                    "Pizza con salsa de tomate, queso mozzarella, jamón y piña.", 11.99, 5),
            new Food("Chicken Alfredo Pasta", "https://cache.dominos.com/olo/6_120_2/assets/build/market/US/_es/images/img/products/larges/S_ALFR.jpg",
                    "Pasta con pollo a la parrilla y salsa Alfredo cremosa.", 7.99, 5),
            new Food("Chocolate Lava Crunch Cake", "https://pbs.twimg.com/media/B0Lak1BIYAA_KXV.jpg:large",
                    "Pastel de chocolate con centro de chocolate fundido y azúcar glas.", 3.99, 5),

    };


    public static Drink[] drinks = {
            // Bebidas para McDonald's (ID: 1)
            new Drink("Coca-Cola", "https://www.benavides.com.mx/media/catalog/product/cache/13134524bf2f7c32f6bea508eba7e730/5/3/531480_2.jpg",
                    "Refresco Coca-Cola clásico.", 1.49, 1),
            new Drink("Sprite", "https://www.smartnfinal.com.mx/wp-content/uploads/2023/02/90898-Soda-sabor-lima-limon-Sprite-355-ml.jpg",
                    "Refresco Sprite refrescante.", 1.49, 1),
            new Drink("Fanta Naranja", "https://m.media-amazon.com/images/I/71BRgeLIIiL._AC_UF894,1000_QL80_.jpg",
                    "Refresco Fanta de naranja.", 1.49, 1),
            new Drink("Agua Mineral", "https://m.media-amazon.com/images/I/81OftcH+BhL.jpg",
                    "Agua mineral.", 1.29, 1),
            new Drink("Café", "https://cache-backend-mcd.mcdonaldscupones.com/media/image/product$cafe-americano-2014.png/200/200/original?country=mx",
                    "Café recién preparado.", 0.99, 1),

            // Bebidas para Burger King (ID: 2)
            new Drink("Coca-Cola", "https://www.benavides.com.mx/media/catalog/product/cache/13134524bf2f7c32f6bea508eba7e730/5/3/531480_2.jpg",
                    "Refresco Coca-Cola clásico.", 1.59, 2),
            new Drink("Dr. Pepper", "https://chedrauimx.vtexassets.com/arquivos/ids/21512091/7501198355536_00.jpg?v=638344030587230000",
                    "Refresco Dr. Pepper.", 1.59, 2),
            new Drink("Limonada", "https://www.marketingnews.es/siteresources/files/421/42.JPG",
                    "Limonada fresca y refrescante.", 1.79, 2),
            new Drink("Té Helado", "https://www.smartnfinal.com.mx/wp-content/uploads/2016/08/9025-Te-negro-sabor-limon-Fuze-600.jpg",
                    "Té helado con hielo.", 1.59, 2),
            new Drink("Café", "https://www.elglobo.com.mx/cdn/shop/products/americano-1_800x.jpg?v=1618806696",
                    "Café recién preparado.", 0.99, 2),

            // Bebidas para KFC (ID: 3)
            new Drink("Pepsi", "https://m.media-amazon.com/images/I/51h232yC+zL.jpg",
                    "Refresco Pepsi clásico.", 1.49, 3),
            new Drink("7UP", "https://chedrauimx.vtexassets.com/arquivos/ids/21495451/7501022014554_01.jpg?v=638343946949430000",
                    "Refresco 7UP refrescante.", 1.49, 3),
            new Drink("Mountain Dew", "https://chedrauimx.vtexassets.com/arquivos/ids/21496974-800-auto?v=638343953545000000&width=800&height=auto&aspect=true",
                    "Refresco Mountain Dew.", 1.49, 3),
            new Drink("Té Helado", "https://www.smartnfinal.com.mx/wp-content/uploads/2016/08/9025-Te-negro-sabor-limon-Fuze-600.jpg",
                    "Té helado con hielo.", 1.29, 3),
            new Drink("Agua Mineral", "https://m.media-amazon.com/images/I/81OftcH+BhL.jpg",
                    "Agua mineral .", 1.29, 3),

            // Bebidas para Pizza Hut (ID: 4)
            new Drink("Pepsi", "https://m.media-amazon.com/images/I/51h232yC+zL.jpg",
                    "Refresco Pepsi clásico.", 1.49, 4),
            new Drink("Sierra Mist", "https://m.media-amazon.com/images/I/417h3hleSvL.jpg",
                    "Refresco Sierra Mist refrescante.", 1.49, 4),
            new Drink("Té Helado", "https://www.smartnfinal.com.mx/wp-content/uploads/2016/08/9025-Te-negro-sabor-limon-Fuze-600.jpg",
                    "Té helado con hielo.", 1.29, 4),
            new Drink("Agua Mineral", "https://m.media-amazon.com/images/I/81OftcH+BhL.jpg",
                    "Agua mineral .", 1.29, 4),
            new Drink("Pepsi Wild Cherry", "https://capitanmonchis.com/cdn/shop/products/drnksod0048nutrition.jpg?v=1666297176",
                    "Refresco Pepsi Wild Cherry.", 1.59, 4),

            // Bebidas para Domino's Pizza (ID: 5)
            new Drink("Coca-Cola", "https://www.benavides.com.mx/media/catalog/product/cache/13134524bf2f7c32f6bea508eba7e730/5/3/531480_2.jpg",
                    "Refresco Coca-Cola clásico.", 1.49, 5),
            new Drink("Sprite", "https://www.smartnfinal.com.mx/wp-content/uploads/2023/02/90898-Soda-sabor-lima-limon-Sprite-355-ml.jpg",
                    "Refresco Sprite refrescante.", 1.49, 5),
            new Drink("Fanta Naranja", "https://m.media-amazon.com/images/I/71BRgeLIIiL._AC_UF894,1000_QL80_.jpg",
                    "Refresco Fanta de naranja.", 1.49, 5),
            new Drink("Agua Mineral", "https://m.media-amazon.com/images/I/81OftcH+BhL.jpg",
                    "Agua mineral .", 1.29, 5),
            new Drink("Té Helado", "https://www.smartnfinal.com.mx/wp-content/uploads/2016/08/9025-Te-negro-sabor-limon-Fuze-600.jpg",
                    "Té helado con hielo.", 1.29, 5),
    };



    public static Complement[] complements = {
            // Complementos para McDonald's (ID: 1)
            new Complement("Papas Fritas Pequeñas", "https://mcdonalds.es/api/cms/images/mcdonalds-es/cd5075cb-d35a-4f79-8711-87ed2d09a0f6_1080x943_Patatas_Fritas_peque%C3%B1as.png?auto=compress,format",
                    "Pequeñas papas fritas doradas y crujientes.", 1.49, 1),
            new Complement("McFlurry Oreo", "https://mcdonalds.es/api/cms/images/mcdonalds-es/2e6be1c1-8cb0-4e9f-b16e-59b0d83aa57c_McFlurry+Oreo.png?auto=compress,format",
                    "Helado de vainilla con trozos de galleta Oreo y salsa de chocolate.", 2.49, 1),
            new Complement("Ensalada de Pollo a la Parrilla", "https://www.goya.com/media/4186/grilled-chicken-salad.jpg?quality=80",
                    "Ensalada fresca con pechuga de pollo a la parrilla y aderezo de tu elección.", 4.99, 1),
            new Complement("Wrap de Pollo Ranch", "https://3.bp.blogspot.com/-b9HMVOyJjr4/USLzRnXalMI/AAAAAAAAAW4/6O1xmnivfSo/s1600/BuffaloChickenWrapSyS2.jpg",
                    "Wrap de pollo con lechuga, tomate, queso cheddar y aderezo ranch.", 3.99, 1),
            new Complement("Sundae de Caramelo", "https://s7d1.scene7.com/is/image/mcdonalds/DC_201907_0345_CaramelSundae_832x472:1-3-product-tile-desktop?wid=765&hei=472&dpr=off",
                    "Sundae de helado de vainilla con salsa de caramelo y nueces.", 1.79, 1),

            // Complementos para Burger King (ID: 2)
            new Complement("Aros de Cebolla", "https://s3.eu-central-1.amazonaws.com/www.burgerking.com.mx/wp-content/uploads/sites/3/2021/02/24091710/1200x800_05_ArosDeCebolla-2-1.png",
                    "Aros de cebolla crujientes y dorados.", 2.29, 2),
            new Complement("Nuggets de Pollo (10 piezas)", "https://www.burgerking.com.mx/wp-media-folder-bk-mex//home/ubuntu/preview/menu-app/frontend/apps/marketing-website-wordpress-app/web/app/uploads/sites/3/Nuggets-10-pzs-1.png",
                    "Diez nuggets de pollo empanizados con tu elección de salsa.", 3.99, 2),
            new Complement("Papas a la Francesa (Pequeñas)", "https://s3.eu-central-1.amazonaws.com/www.burgerking.com.mx/wp-content/uploads/sites/3/2021/02/24094623/1200x800_04_PapasALaFrancesa-1-2.png",
                    "Pequeñas papas fritas doradas y saladas.", 1.99, 2),
            new Complement("Ensalada Crispy Chicken", "https://bk-latam-prod.s3.amazonaws.com/sites/burgerking.latam/files/BK_Web_Ensalada_Cesar_con_pollo_crujiente_300x270px.jpg",
                    "Ensalada fresca con trozos de pollo crujiente y aderezo.", 4.49, 2),
            new Complement("Brownie", "https://s3.eu-central-1.amazonaws.com/www.burgerking.com.mx/wp-content/uploads/sites/3/2021/02/24182205/bk-brownies.png",
                    "Brownie de chocolate con nueces.", 1.99, 2),

            // Complementos para KFC (ID: 3)
            new Complement("Mashed Potatoes", "https://i.pinimg.com/originals/da/68/59/da6859c62c6452b0e583450678be5c24.jpg",
                    "Puré de papas con salsa de pollo.", 1.99, 3),
            new Complement("Cole Slaw", "https://i.ytimg.com/vi/EGrE44RjjY4/maxresdefault.jpg",
                    "Ensalada de col rallada y zanahorias con aderezo cremoso.", 1.49, 3),
            new Complement("Macarrones con Queso", "https://i.pinimg.com/originals/39/61/2f/39612fec4036cbc0e72db3126da22315.jpg",
                    "Macarrones con queso derretido.", 2.49, 3),
            new Complement("Tenders de Pollo (4 piezas)", "https://cdn.tictuk.com/a19bde89-5a54-1372-97fe-616d57942a3a/6fc0a9ac-73b2-fd86-e356-b110efbcacad.jpeg?a=231d2fa5-583d-faa7-fd80-2a7c388d5ff1",
                    "Cuatro tiras de pollo empanizado con salsa de tu elección.", 4.99, 3),
            new Complement("Galleta con Chocolate", "https://tofuu.getjusto.com/orioneat-prod-resized/RqBkYrhxq2mLNj8n8-350-350.webp",
                    "Galleta con chispas de chocolate.", 1.29, 3),

            // Complementos para Pizza Hut (ID: 4)
            new Complement("Pan de Ajo", "https://pizzahutadomicilio.es/img/cms/panes%20de%20ajo%20pizza%20hut.png",
                    "Palitos de pan de ajo horneados y cubiertos de ajo y mantequilla.", 3.99, 4),
            new Complement("Palitos de Queso", "https://i.pinimg.com/originals/65/eb/56/65eb56c2dcd86178d9be19445535af3c.jpg",
                    "Palitos de masa con queso mozzarella y servidos con salsa marinara.", 5.99, 4),
            new Complement("Alitas de Pollo (10 piezas)", "https://pizzahutconstituyentesqueretaro.files.wordpress.com/2015/05/alitas.jpg?w=712",
                    "Diez alitas de pollo con tu elección de salsa.", 9.99, 4),
            new Complement("Ensalada César", "https://images.pizzahut.es/Products/Original/ph_ensaladacesar_detail-1739.jpg",
                    "Ensalada César con lechuga, crutones, queso parmesano y aderezo César.", 4.99, 4),
            new Complement("Palitos de Canela", "https://www.wikihow.com/images_en/thumb/9/9b/Make-Cinnamon-Roll-Sticks-Final.jpg/v4-1200px-Make-Cinnamon-Roll-Sticks-Final.jpg",
                    "Palitos de canela glaseados con azúcar y canela, servidos con glaseado de crema de queso.", 4.99, 4),

            // Complementos para Domino's Pizza (ID: 5)
            new Complement("Pan de Ajo", "https://cache.dominos.com/olo/6_120_2/assets/build/market/US/_es/images/img/products/larges/F_PBITES.jpg",
                    "Palitos de pan de ajo horneados y cubiertos de ajo y mantequilla.", 3.99, 5),
            new Complement("Palitos de Queso", "https://pbs.twimg.com/media/DRlCpaqWsAAseAZ.jpg",
                    "Palitos de masa con queso mozzarella y servidos con salsa marinara.", 5.99, 5),
            new Complement("Alitas de Pollo (8 piezas)", "https://cache.dominos.com/olo/6_120_2/assets/build/market/US/_es/images/img/products/larges/S_BBQW.jpg",
                    "Ocho alitas de pollo con tu elección de salsa.", 7.99, 5),
            new Complement("Ensalada César", "https://cache.dominos.com/olo/6_120_2/assets/build/market/US/_es/images/img/products/larges/F_CCAESAR.jpg",
                    "Ensalada César con lechuga, crutones, queso parmesano y aderezo César.", 4.99, 5),
            new Complement("Palitos de Canela", "https://pbs.twimg.com/media/CiMUZJ0WEAAd7XL.jpg",
                    "Palitos de canela glaseados con azúcar y canela, servidos con glaseado de crema de queso.", 4.99, 5),
    };


}
