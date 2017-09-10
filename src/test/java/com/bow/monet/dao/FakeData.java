package com.bow.monet.dao;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

/**
 * COPY 1000000 RECORDS INTO "mdata1" FROM 'D:/data.csv' USING DELIMITERS ',';
 * @author vv
 * @since 2017/9/10.
 */
public class FakeData {

    public void fake() throws IOException {
        File file = new File("D:/data.csv");
        FileOutputStream fos = new FileOutputStream(file);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        for(int bat=0; bat<500; bat++){
            bw.write(data(bat));
            System.out.println("stored bat "+bat);
        }
        bw.flush();
        fos.close();
    }

    public String data(int bat) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random(3);
        for (int i = 0; i < 10000; i++) {
            double rd = random.nextDouble();
            int ri = random.nextInt(1000);
            int id = i * bat+i;
            sb.append(id).append(",");
            sb.append("vv" + id).append(",");
            sb.append("127.0.0." + id).append(",");
            sb.append(ri).append(",");
            sb.append("nick" + id).append(",");
            sb.append("sn" + id).append(",");
            sb.append(rd + 0).append(",");
            sb.append(rd + 1).append(",");
            sb.append(rd + 2).append(",");
            sb.append(rd + 3).append(",");
            sb.append(rd + 4).append(",");
            sb.append(rd + 5).append(",");
            sb.append(rd + 6).append(",");
            sb.append(rd + 7).append(",");
            sb.append(rd + 8).append(",");
            sb.append(rd + 9).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        FakeData data = new FakeData();
        data.fake();
    }
}
