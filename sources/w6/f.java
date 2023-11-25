package w6;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: ImageMatrixProperty.java */
/* loaded from: classes3.dex */
public class f extends Property<ImageView, Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f25419a;

    public f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f25419a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public Matrix get(ImageView imageView) {
        this.f25419a.set(imageView.getImageMatrix());
        return this.f25419a;
    }

    @Override // android.util.Property
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
