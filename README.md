# HW-3

<h2>ویرایش ایرادات</h2>
<p>در این قسمت ابتدا ایراداتی که در کد وجود دارند را می‌یابیم و سپس با استفاده از رویکرد TDD آن‌ها را اصلاح می‌کنیم.</p>
<h3>ایراد اول</h3>
<p>اولین ایرادی که توجه ما را به خود جلب کرد، مربوط به تابع lendBook در کلاس Library بود. مطابق کامنتی که بالای تابع قرار گرفته‌است، انتظار می‌رود اگر یک دانشجو قبلا وارد سامانه نشده‌بود، نتوانیم به او کتابی قرض بدهیم. برای آن که نشان دهیم این انتظار برآورده نشده‌است، از آزمون زیر استفاده کردیم که همان‌طور که می‌بینید در ابتدا fail شده‌است:</p>
![آزمون اول](https://github.com/SE-Lab-1402-03-G11/HW-3/blob/AliRahmizad/Document/FirstPart/Pictures/Test1.png)
![رد شدن آزمون اول](https://github.com/SE-Lab-1402-03-G11/HW-3/blob/AliRahmizad/Document/FirstPart/Pictures/Test1%20Failed.png)
<p>برای رفع این ایراد لازم بود این چند خط را به بدنه‌ی تابع اضافه کنیم و پس از آن کدی به دست آمد در این آزمون پذیرفته شد:</p>
![کد بخش اول](https://github.com/SE-Lab-1402-03-G11/HW-3/blob/AliRahmizad/Document/FirstPart/Pictures/Test1%20Passed.png)
<h3>ایراد دوم</h3>
<p>دومین ایرادی که توجه ما را به خود جلب کرد، مربوط به تابع returnBook در کلاس Library بود. مطابق کامنتی که بالای تابع قرار گرفته‌است، انتظار می‌رود اگر کتاب از دانشجو پس گرفته‌شد، از فهرست کتاب‌هایی که در اختیار اوست حذف شود. برای آن که نشان دهیم این انتظار برآورده نشده‌است، از آزمون زیر استفاده کردیم که همان‌طور که می‌بینید در ابتدا fail شده‌است:</p>
![آزمون دوم](https://github.com/SE-Lab-1402-03-G11/HW-3/blob/AliRahmizad/Document/FirstPart/Pictures/Test2.png)
![رد شدن آزمون دوم](https://github.com/SE-Lab-1402-03-G11/HW-3/blob/AliRahmizad/Document/FirstPart/Pictures/Test2%20Failed.png)
<p>:برای رفع این ایراد لازم بود این خط را به بدنه‌ی تابع اضافه کنیم و پس از آن کدی به دست آمد در این آزمون پذیرفته شد:</p>
![کد بخش دوم](https://github.com/SE-Lab-1402-03-G11/HW-3/blob/AliRahmizad/Document/FirstPart/Pictures/Test2%20Passed.png)

<h2>پرسش‌ها</h2>
<h3>پرسش اول</h3>
<p>مهم‌ترین نکته‌ای که می‌توان به آن اشاره کرد، تفاوت عملکرد این دو رویکرد در پروژه‌هایی با نیازهای متغیر است. در TDD چون آزمون‌ها را پیش از نوشتن کد اصلی می‌نویسیم، اگر نیازمندی‌های جدید اضافه شوند و یا قبلی‌ها تغییر کنند، به راحتی به کمک آزمون‌های مرتبط می‌توان آن‌ها را به پروژه افزود. از سوی دیگر در رویکرد سنتی تغییر در نیازمندی‌ها را نمی‌توان به سادگی مدیریت کرد. در واقع تنها در صورتی که نیازمندی‌ها تغییرات کمی داشته‌باشند، می‌توان پس از نوشتن کد به راحتی آزمون‌های ضروری را نوشت.</p>
<p>از سوی دیگر برای پروژه‌هایی که پیچیده‌تر هستند، استفاده از TDD منطقی‌تر است. چون این‌گونه پروژه‌ها نیاز به آن دارند که تست‌های جامع و دقیقی برای تک‌تک ابعاد فعالیتشان تدوین شود و اگر پس از کامل شدن کد اقدام به نوشتن آزمون کنیم، ممکن است نتوانیم همه‌ی جنبه‌ها را پوشش دهیم. به‌طور مشابه در پروژه‌هایی که کیفیت و دقت بسیار حائز اهمیت هستند، TDD توصیه می‌شود. از سوی دیگر در پروژه‌های کوتاه‌مدت و کوچک می‌توان بدون پذیرفتن چارچوب TDD و با همان روش‌های سنتی فرایند توسعه را کامل کرد.</p>
<p>موارد دیگری نیز هستند که می‌توان به آن‌ها اشاره کرد که به آن‌ها فقط به شکل مختصر اشاره می‌کنیم. پروژه‌هایی که نیاز به خودکارسازی آزمون‌ها دارند، پروژه‌هایی که از آزمون‌ها به عنوان ارکان مستندسازی استفاده می‌کنند، پروژه‌هایی که در چرخه‌های توسعه‌ی کوتاه‌تری انجام می‌شوند، پروژه‌هایی که در آن‌ها سرعت شناخت خطاها مهم است، و ... با رویکرد TDD بهتر پیش می‌روند.</p>
<h3>پرسش دوم</h3>
<p>اعضای تیم توسعه نیاز دارند اطمینان حاصل کنند که کدی که می‌نویسند، به درستی کار می‌کند و به خوبی با سایر بخش‌های سامانه ادغام می‌شود. به همین دلیل آن‌ها معمولا آزمون‌هایی می‌نویسند که در فرآیند توسعه ادغام می‌شوند و می‌توانند در همان مراحل اولیه مشکلات را شناسایی و رفع کنند. از انواع این آزمون‌ها می‌توان به موارد زیر اشاره کرد:</p>
<p>آزمون واحد: این آزمون واحدها و اجزای مستقل از یکدیگر کد را بررسی می‌کند تا مطمئن شود هدفی که برایش طراحی شده‌اند را برآورده می‌کنند. به بیان دیگر، این آزمون‌ها برای پیدا کردن و رفع ایرادها در کوچک‌ترین سطح عملکرد طراحی می‌شوند.</p>
<p>آزمون یک‌پارچه‌سازی: برای آن که تعاملات میان اجزا و واحدهای کد بررسی شوند، از این نوع از آزمون‌ها استفاده می‌شود. به بیان دیگر، مسائلی که هنگام تعامل واحدهای گوناگون با یکدیگر رخ می‌دهد، به کمک این آزمون‌ها شناخته می‌شوند.</p>
<p>آزمون Smoke: فرض کنید یک نسخه‌ی جدید از پروژه‌ای که وجود داشته‌است، منتشر شده‌است. این نوع از آزمون‌ها عملکرد اولیه‌ی نرم‌افزار پس از اعمال این تغییرها را به شکل کلی بررسی می‌کنند. به بیان دیگر، پیش از آن که آزمون‌های جزئی‌تر و دقیق‌تر روی کد اجرا شوند، به کمک این آزمون‌ها از عملکرد ارکان مهم‌تر کد اطمینان حاصل می‌کنیم.</p>
<p>اعضای تیم تضمین کیفیت نیاز دارند اطمینان حاصل کنند که نرم‌افزاری که قرار است منتشر شود، معیارهایی کلی برای کیفیت را داشته باشد. به همین دلیل آن‌ها معمولا بر اساس سناریوهایی که در دنیای واقعی رخ می‌دهند، آزمون‌هایی جامع برای اطمینان از کیفیت نرم‌افزار می‌نویسند. از انواع این آزمون‌ها می‌توان به موارد زیر اشاره کرد:</p>
<p>آزمون عملکردی: این آزمون نرم‌افزار را در برابر نیازمندی‌ها و مشخصات عملکردی بررسی می‌کند تا ببیند عملکرد آن مطابق انتظار است یا خیر.</p>
<p>آزمون غیرعملکردی: این آزمون جنبه‌های گوناگونی مانند امنیت، کارایی، قابلیت اطمینان، و ... را می‌سنجد. هدف آن است که ببینیم سامانه در موقعیت‌های گوناگون می‌تواند استانداردهای کیفیتی مورد نظر را تضمین کند یا خیر.</p>
<p>آزمون پذیرش: این آزمون بررسی می‌کند محصول تولیدشده آماده‌ی آن است که به مشتریان عرضه شود یا خیر. به بیان دیگر، لازم است بررسی شود که آیا استانداردهای تجاری ضروری رعایت می‌شوند یا خیر. به کمک این آزمون اطمینان حاصل می‌شود که محصول تولید‌شده قابل استفاده است.</p>