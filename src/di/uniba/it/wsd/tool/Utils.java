/**
   Copyright (c) 2014, the LESK-WSD-DSM AUTHORS.

   All rights reserved.

   Redistribution and use in source and binary forms, with or without
   modification, are permitted provided that the following conditions are
   met:

 * Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.

 * Redistributions in binary form must reproduce the above
   copyright notice, this list of conditions and the following
   disclaimer in the documentation and/or other materials provided
   with the distribution.

 * Neither the name of the University of Bari nor the names
   of its contributors may be used to endorse or promote products
   derived from this software without specific prior written
   permission.

   THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
   "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
   LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
   A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
   CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
   EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
   PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
   PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
   LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
   NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
   SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
    
   GNU GENERAL PUBLIC LICENSE - Version 3, 29 June 2007
 **/

package di.uniba.it.wsd.tool;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Some utils to extract text from a file
 * @author pierpaolo
 */
public class Utils {
    
    /**
     *
     * @param filename
     * @return
     * @throws IOException
     */
    public static String extractTextFromFile(String filename) throws IOException {
        return extractTextFromFile(new File(filename));
    }

    /**
     *
     * @param file
     * @return
     * @throws IOException
     */
    public static String extractTextFromFile(File file) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        while (in.ready()) {
            sb.append(in.readLine());
            sb.append("\n");
        }
        in.close();
        return sb.toString();
    }

}