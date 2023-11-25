package jb;

import android.content.res.AssetManager;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import io.noties.markwon.image.j;
import io.noties.markwon.image.r;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: FileSchemeHandler.java */
/* loaded from: classes4.dex */
public class a extends r {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f19086a;

    a(AssetManager assetManager) {
        this.f19086a = assetManager;
    }

    public static a c(AssetManager assetManager) {
        return new a(assetManager);
    }

    @Override // io.noties.markwon.image.r
    public j a(String str, Uri uri) {
        InputStream bufferedInputStream;
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments != null && pathSegments.size() != 0) {
            boolean equals = "android_asset".equals(pathSegments.get(0));
            String lastPathSegment = uri.getLastPathSegment();
            if (equals) {
                if (this.f19086a != null) {
                    StringBuilder sb2 = new StringBuilder();
                    int size = pathSegments.size();
                    for (int i10 = 1; i10 < size; i10++) {
                        if (i10 != 1) {
                            sb2.append('/');
                        }
                        sb2.append(pathSegments.get(i10));
                    }
                    try {
                        bufferedInputStream = this.f19086a.open(sb2.toString());
                    } catch (IOException e10) {
                        throw new IllegalStateException("Exception obtaining asset file: " + str + ", path: " + sb2.toString(), e10);
                    }
                } else {
                    throw new IllegalStateException("Supplied file path points to assets, but FileSchemeHandler was not supplied with AssetsManager. Use `#createWithAssets` factory method to create FileSchemeHandler that can handle android assets");
                }
            } else {
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path)) {
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(path)));
                    } catch (FileNotFoundException e11) {
                        throw new IllegalStateException("Exception reading file: " + str, e11);
                    }
                } else {
                    throw new IllegalStateException("Invalid file path: " + str + ", " + path);
                }
            }
            return j.d(MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(lastPathSegment)), bufferedInputStream);
        }
        throw new IllegalStateException("Invalid file path: " + str);
    }

    @Override // io.noties.markwon.image.r
    public Collection<String> b() {
        return Collections.singleton("file");
    }
}
