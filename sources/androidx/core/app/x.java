package androidx.core.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* compiled from: SharedElementCallback.java */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    private Matrix f3800a;

    /* compiled from: SharedElementCallback.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    private static Bitmap a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            float min = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
            if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int i10 = (int) (intrinsicWidth * min);
            int i11 = (int) (intrinsicHeight * min);
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Rect bounds = drawable.getBounds();
            int i12 = bounds.left;
            int i13 = bounds.top;
            int i14 = bounds.right;
            int i15 = bounds.bottom;
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
            drawable.setBounds(i12, i13, i14, i15);
            return createBitmap;
        }
        return null;
    }

    public Parcelable b(View view, Matrix matrix, RectF rectF) {
        Bitmap a10;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null && (a10 = a(drawable)) != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("sharedElement:snapshot:bitmap", a10);
                bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] fArr = new float[9];
                    imageView.getImageMatrix().getValues(fArr);
                    bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                }
                return bundle;
            }
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / (round * round2));
            int i10 = (int) (round * min);
            int i11 = (int) (round2 * min);
            if (this.f3800a == null) {
                this.f3800a = new Matrix();
            }
            this.f3800a.set(matrix);
            this.f3800a.postTranslate(-rectF.left, -rectF.top);
            this.f3800a.postScale(min, min);
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.concat(this.f3800a);
            view.draw(canvas);
            return createBitmap;
        }
        return null;
    }

    public View c(Context context, Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
            if (bitmap == null) {
                return null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
            if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                Matrix matrix = new Matrix();
                matrix.setValues(floatArray);
                imageView.setImageMatrix(matrix);
                return imageView;
            }
            return imageView;
        } else if (!(parcelable instanceof Bitmap)) {
            return null;
        } else {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageBitmap((Bitmap) parcelable);
            return imageView2;
        }
    }

    public void h(List<String> list, List<View> list2, a aVar) {
        aVar.a();
    }

    public void e(List<View> list) {
    }

    public void d(List<String> list, Map<String, View> map) {
    }

    public void f(List<String> list, List<View> list2, List<View> list3) {
    }

    public void g(List<String> list, List<View> list2, List<View> list3) {
    }
}
