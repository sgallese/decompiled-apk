package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class g0 extends x7.z {

    /* renamed from: f  reason: collision with root package name */
    private final File f10817f;

    /* renamed from: m  reason: collision with root package name */
    private final File f10818m;

    /* renamed from: p  reason: collision with root package name */
    private final NavigableMap f10819p = new TreeMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(File file, File file2) throws IOException {
        this.f10817f = file;
        this.f10818m = file2;
        List<File> a10 = c3.a(file, file2);
        if (!a10.isEmpty()) {
            long j10 = 0;
            for (File file3 : a10) {
                this.f10819p.put(Long.valueOf(j10), file3);
                j10 += file3.length();
            }
            return;
        }
        throw new c1(String.format("Virtualized slice archive empty for %s, %s", file, file2));
    }

    private final InputStream e(long j10, Long l10) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f10819p.get(l10));
        if (fileInputStream.skip(j10 - l10.longValue()) == j10 - l10.longValue()) {
            return fileInputStream;
        }
        throw new c1(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l10));
    }

    @Override // x7.z
    public final long b() {
        Map.Entry lastEntry = this.f10819p.lastEntry();
        return ((Long) lastEntry.getKey()).longValue() + ((File) lastEntry.getValue()).length();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x7.z
    public final InputStream c(long j10, long j11) throws IOException {
        if (j10 >= 0 && j11 >= 0) {
            long j12 = j10 + j11;
            if (j12 <= b()) {
                Long l10 = (Long) this.f10819p.floorKey(Long.valueOf(j10));
                Long l11 = (Long) this.f10819p.floorKey(Long.valueOf(j12));
                if (l10.equals(l11)) {
                    return new f0(e(j10, l10), j11);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(e(j10, l10));
                Collection values = this.f10819p.subMap(l10, false, l11, false).values();
                if (!values.isEmpty()) {
                    arrayList.add(new u7.i(Collections.enumeration(values)));
                }
                arrayList.add(new f0(new FileInputStream((File) this.f10819p.get(l11)), j11 - (l11.longValue() - j10)));
                return new SequenceInputStream(Collections.enumeration(arrayList));
            }
            throw new c1(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(b()), Long.valueOf(j12)));
        }
        throw new c1(String.format("Invalid input parameters %s, %s", Long.valueOf(j10), Long.valueOf(j11)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
