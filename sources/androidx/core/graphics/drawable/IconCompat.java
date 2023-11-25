package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.util.i;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f3881k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f3882a;

    /* renamed from: b  reason: collision with root package name */
    Object f3883b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f3884c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f3885d;

    /* renamed from: e  reason: collision with root package name */
    public int f3886e;

    /* renamed from: f  reason: collision with root package name */
    public int f3887f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f3888g;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f3889h;

    /* renamed from: i  reason: collision with root package name */
    public String f3890i;

    /* renamed from: j  reason: collision with root package name */
    public String f3891j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static IconCompat a(Object obj) {
            i.g(obj);
            int d10 = d(obj);
            if (d10 != 2) {
                if (d10 != 4) {
                    if (d10 != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.f3883b = obj;
                        return iconCompat;
                    }
                    return IconCompat.c(e(obj));
                }
                return IconCompat.f(e(obj));
            }
            return IconCompat.i(null, c(obj), b(obj));
        }

        static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        static int d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        static Icon g(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f3882a) {
                case -1:
                    return (Icon) iconCompat.f3883b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f3883b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.l(), iconCompat.f3886e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f3883b, iconCompat.f3886e, iconCompat.f3887f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f3883b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT >= 26) {
                        createWithBitmap = b.b((Bitmap) iconCompat.f3883b);
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.b((Bitmap) iconCompat.f3883b, false));
                        break;
                    }
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        createWithBitmap = d.a(iconCompat.n());
                        break;
                    } else if (context != null) {
                        InputStream o10 = iconCompat.o(context);
                        if (o10 != null) {
                            if (i10 >= 26) {
                                createWithBitmap = b.b(BitmapFactory.decodeStream(o10));
                                break;
                            } else {
                                createWithBitmap = Icon.createWithBitmap(IconCompat.b(BitmapFactory.decodeStream(o10), false));
                                break;
                            }
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.n());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.n());
                    }
            }
            ColorStateList colorStateList = iconCompat.f3888g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f3889h;
            if (mode != IconCompat.f3881k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f3882a = -1;
        this.f3884c = null;
        this.f3885d = null;
        this.f3886e = 0;
        this.f3887f = 0;
        this.f3888g = null;
        this.f3889h = f3881k;
        this.f3890i = null;
    }

    public static IconCompat a(Icon icon) {
        return a.a(icon);
    }

    static Bitmap b(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat c(Uri uri) {
        androidx.core.util.c.c(uri);
        return d(uri.toString());
    }

    public static IconCompat d(String str) {
        androidx.core.util.c.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f3883b = str;
        return iconCompat;
    }

    public static IconCompat e(Bitmap bitmap) {
        androidx.core.util.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f3883b = bitmap;
        return iconCompat;
    }

    public static IconCompat f(Uri uri) {
        androidx.core.util.c.c(uri);
        return g(uri.toString());
    }

    public static IconCompat g(String str) {
        androidx.core.util.c.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f3883b = str;
        return iconCompat;
    }

    public static IconCompat h(Context context, int i10) {
        androidx.core.util.c.c(context);
        return i(context.getResources(), context.getPackageName(), i10);
    }

    public static IconCompat i(Resources resources, String str, int i10) {
        androidx.core.util.c.c(str);
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f3886e = i10;
            if (resources != null) {
                try {
                    iconCompat.f3883b = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f3883b = str;
            }
            iconCompat.f3891j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    private static String u(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap j() {
        int i10 = this.f3882a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f3883b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i10 == 1) {
            return (Bitmap) this.f3883b;
        } else {
            if (i10 == 5) {
                return b((Bitmap) this.f3883b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int k() {
        int i10 = this.f3882a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.b(this.f3883b);
        }
        if (i10 == 2) {
            return this.f3886e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String l() {
        int i10 = this.f3882a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.c(this.f3883b);
        }
        if (i10 == 2) {
            String str = this.f3891j;
            if (str != null && !TextUtils.isEmpty(str)) {
                return this.f3891j;
            }
            return ((String) this.f3883b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int m() {
        int i10 = this.f3882a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.d(this.f3883b);
        }
        return i10;
    }

    public Uri n() {
        int i10 = this.f3882a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.e(this.f3883b);
        }
        if (i10 != 4 && i10 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f3883b);
    }

    public InputStream o(Context context) {
        Uri n10 = n();
        String scheme = n10.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f3883b));
            } catch (FileNotFoundException e10) {
                Log.w("IconCompat", "Unable to load image from path: " + n10, e10);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(n10);
        } catch (Exception e11) {
            Log.w("IconCompat", "Unable to load image from URI: " + n10, e11);
            return null;
        }
    }

    public void p() {
        this.f3889h = PorterDuff.Mode.valueOf(this.f3890i);
        switch (this.f3882a) {
            case -1:
                Parcelable parcelable = this.f3885d;
                if (parcelable != null) {
                    this.f3883b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f3885d;
                if (parcelable2 != null) {
                    this.f3883b = parcelable2;
                    return;
                }
                byte[] bArr = this.f3884c;
                this.f3883b = bArr;
                this.f3882a = 3;
                this.f3886e = 0;
                this.f3887f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3884c, Charset.forName("UTF-16"));
                this.f3883b = str;
                if (this.f3882a == 2 && this.f3891j == null) {
                    this.f3891j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3883b = this.f3884c;
                return;
        }
    }

    public void q(boolean z10) {
        this.f3890i = this.f3889h.name();
        switch (this.f3882a) {
            case -1:
                if (!z10) {
                    this.f3885d = (Parcelable) this.f3883b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z10) {
                    Bitmap bitmap = (Bitmap) this.f3883b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f3884c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f3885d = (Parcelable) this.f3883b;
                return;
            case 2:
                this.f3884c = ((String) this.f3883b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f3884c = (byte[]) this.f3883b;
                return;
            case 4:
            case 6:
                this.f3884c = this.f3883b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Bundle r() {
        Bundle bundle = new Bundle();
        switch (this.f3882a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f3883b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f3883b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f3883b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f3883b);
                break;
        }
        bundle.putInt(TaskFormActivity.TASK_TYPE_KEY, this.f3882a);
        bundle.putInt("int1", this.f3886e);
        bundle.putInt("int2", this.f3887f);
        bundle.putString("string1", this.f3891j);
        ColorStateList colorStateList = this.f3888g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f3889h;
        if (mode != f3881k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    public Icon s() {
        return t(null);
    }

    public Icon t(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public String toString() {
        if (this.f3882a == -1) {
            return String.valueOf(this.f3883b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(u(this.f3882a));
        switch (this.f3882a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f3883b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f3883b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f3891j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(k())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f3886e);
                if (this.f3887f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f3887f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f3883b);
                break;
        }
        if (this.f3888g != null) {
            sb2.append(" tint=");
            sb2.append(this.f3888g);
        }
        if (this.f3889h != f3881k) {
            sb2.append(" mode=");
            sb2.append(this.f3889h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    IconCompat(int i10) {
        this.f3884c = null;
        this.f3885d = null;
        this.f3886e = 0;
        this.f3887f = 0;
        this.f3888g = null;
        this.f3889h = f3881k;
        this.f3890i = null;
        this.f3882a = i10;
    }
}
