// Bahaya dari mencampur kode blocking dengang non-blocking

const fs = require('fs');
fs.readFile('/file.md', (err, data) => {
	if(err) throw err;
	console.log(data);
});
fs.unlinkSync('/file.md');

/**
 * pada contoh di atas fs.unlinkSyn() kemungkinan besar akan berjalan sebelum fs.readFile(), yangmana akan
 * menghapus file.md sebelum file itu dibaca. Cara yg lebih baik untuk menulis kode ini dengan cara non-blocking
 * dan terjamin akan dieksekusi dan terjamin akan dieksekusi dalam urutan yg benar adalah sebagai berikut 
 */

 const fs = require('fs');
 fs.readFile('/file.md', (readFileErr, data) => {
	if (readFileErr) throw readFileErr;
	console.log(data);
	fs.unlink('/file.md', (unlinkErr) => {
		if (unlinkErr) throw unlinkErr;
	});
 });